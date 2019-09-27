package com.erudika.para.client;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author qhuynh
 * See com/erudika/para/core/Linker.java
 */
public class Linker implements ParaObject, Serializable {

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getObjectURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAppid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAppid(String appid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTags(List<String> tags) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getStored() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStored(Boolean stored) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getIndexed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setIndexed(Boolean indexed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getCached() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCached(Boolean cached) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getTimestamp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTimestamp(Long timestamp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCreatorid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCreatorid(String creatorid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPlural() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getParentid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setParentid(String parentid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUpdated(Long updated) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean voteUp(String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean voteDown(String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Integer getVotes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVotes(Integer votes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVersion(Long version) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long countLinks(String type2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Linker> getLinks(String type2, Pager... pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> getLinkedObjects(String type, Pager... pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> findLinkedObjects(String type, String field, String query, Pager... pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLinked(String type2, String id2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLinked(ParaObject toObj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String link(String id2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unlink(String type, String id2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unlinkAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Long countChildren(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> getChildren(String type, Pager... pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> getChildren(String type, String field, String term, Pager... pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> findChildren(String type, String query, Pager... pager) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteChildren(String type) {
		// TODO Auto-generated method stub
		
	}

}
