/*
 * Copyright 2013-2019 Erudika. https://erudika.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * For issues and patches go to: https://github.com/erudika
 */
package com.erudika.scoold.controllers;

import static com.erudika.scoold.ScooldServer.SIGNINLINK;
import static com.erudika.scoold.ScooldServer.SPACE_COOKIE;
import static com.erudika.scoold.ScooldServer.TAGSLINK;

import com.erudika.para.client.Pager;
import com.erudika.para.client.Tag;
import com.erudika.scoold.core.Profile;
import static com.erudika.scoold.utils.HttpUtils.getCookieValue;
import com.erudika.scoold.utils.ScooldUtils;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Alex Bogdanovski [alex@erudika.com]
 */
@Controller
@RequestMapping("/tags")
public class TagsController {

	private final ScooldUtils utils;

	@Inject
	public TagsController(ScooldUtils utils) {
		this.utils = utils;
	}

	@GetMapping
	public String get(@RequestParam(required = false, defaultValue = "count") String sortby,
			HttpServletRequest req, Model model) {
		Pager itemcount = utils.getPager("page", req);
		itemcount.setSortby(sortby);
		itemcount.setDesc(!"tag".equals(sortby));

		Profile authUser = utils.getAuthUser(req);
		String currentSpace = utils.getValidSpaceId(authUser, getCookieValue(req, SPACE_COOKIE));
		List<Tag> tagslist = Collections.emptyList();
		if (utils.canAccessSpace(authUser, currentSpace)) {
			tagslist = utils.getParaClient().findTags("", itemcount);
		} else if (!utils.isDefaultSpacePublic()) {
			return "redirect:" + SIGNINLINK + "?returnto=" + TAGSLINK;
		}

		model.addAttribute("path", "tags.vm");
		model.addAttribute("title", utils.getLang(req).get("tags.title"));
		model.addAttribute("tagsSelected", "navbtn-hover");
		model.addAttribute("itemcount", itemcount);
		model.addAttribute("tagslist", tagslist);
		return "base";
	}

	@ResponseBody
	@GetMapping(path = "/{keyword}", produces = MediaType.APPLICATION_JSON)
	public List<?> findTags(@PathVariable String keyword) {
		return utils.getParaClient().findTags(keyword, new Pager(10));
	}
}
