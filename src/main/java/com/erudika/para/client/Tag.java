package com.erudika.para.client;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Tag implements ParaObject {
	private static final long serialVersionUID = 1L;
	private static final String PREFIX = Utils.type(Tag.class).concat(Config.SEPARATOR);

	@Stored private String id;
	@Stored private Long timestamp;
	@Stored private String type;
	@Stored private String appid;
	@Stored private String parentid;
	@Stored private String creatorid;
	@Stored private Long updated;
	@Stored private String name;
	@Stored private List<String> tags;
	@Stored private Integer votes;
	@Stored private Long version;
	@Stored private Boolean stored;
	@Stored private Boolean indexed;
	@Stored private Boolean cached;

	@Stored private String tag;
	@Stored private Integer count;

	/**
	 * No-args constructor.
	 */
	public Tag() {
		this(null);
	}

	/**
	 * Default constructor.
	 * @param id the tag name
	 */
	public Tag(String id) {
		this.count = 0;
		setId(id);
		setName(getName());
	}

	@Override
	public final void setId(String id) {
		if (StringUtils.startsWith(id, PREFIX)) {
			setTag(id.replaceAll(PREFIX, ""));
			this.id = PREFIX.concat(getTag());
		} else if (id != null) {
			setTag(id);
			this.id = PREFIX.concat(getTag());
		}
	}

	@Override
	public String getObjectURI() {
		String defurl = "/".concat(getPlural());
		return (getTag() != null) ? defurl.concat("/").concat(getTag()) : defurl;
	}

	/**
	 * The number of objects tagged with this tag.
	 * @return the number of times this tag is used
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * Sets the number of objects tagged with this tag.
	 * @param count a new count
	 */
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * The tag value.
	 * @return the tag itself
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * Sets the tag value.
	 * @param tag a tag. Must not be null or empty.
	 */
	public void setTag(String tag) {
		this.tag = Utils.noSpaces(Utils.stripAndTrim(tag, " "), "-");
	}

	/**
	 * Increments the count when a new object is tagged.
	 */
	public void incrementCount() {
		this.count++;
	}

	/**
	 * Decrements the count when a new object is untagged.
	 */
	public void decrementCount() {
		this.count--;
		if (this.count < 1 && exists()) {
			delete();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Tag other = (Tag) obj;
		if (!StringUtils.equalsIgnoreCase(tag, other.tag)) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 97 * hash + (this.tag != null ? this.tag.hashCode() : 0);
		return hash;
	}

	////////////////////////////////////////////////////////

	@Override
	public final String getId() {
		return id;
	}

	@Override
	public final String getType() {
		type = (type == null) ? Utils.type(this.getClass()) : type;
		return type;
	}

	@Override
	public final void setType(String type) {
		this.type = type;
	}

	@Override
	public String getAppid() {
		appid = (appid == null) ? Config.getRootAppIdentifier() : appid;
		return appid;
	}

	@Override
	public void setAppid(String appid) {
		this.appid = appid;
	}

	@Override
	public List<String> getTags() {
		return tags;
	}

	@Override
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	@Override
	public Boolean getStored() {
		if (stored == null) {
			stored = true;
		}
		return stored;
	}

	@Override
	public void setStored(Boolean stored) {
		this.stored = stored;
	}

	@Override
	public Boolean getIndexed() {
		if (indexed == null) {
			indexed = true;
		}
		return indexed;
	}

	@Override
	public void setIndexed(Boolean indexed) {
		this.indexed = indexed;
	}

	@Override
	public Boolean getCached() {
		if (cached == null) {
			cached = true;
		}
		return cached;
	}

	@Override
	public void setCached(Boolean cached) {
		this.cached = cached;
	}

	@Override
	public Long getTimestamp() {
		return (timestamp != null && timestamp != 0) ? timestamp : null;
	}

	@Override
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String getCreatorid() {
		return creatorid;
	}

	@Override
	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Override
	public final String getName() {
		return null;
//		return CoreUtils.getInstance().getName(name, id);
	}

	@Override
	public final void setName(String name) {
		this.name = (name == null || !name.isEmpty()) ? name : this.name;
	}

	@Override
	public String getPlural() {
		return Utils.singularToPlural(getType());
	}

	@Override
	public String getParentid() {
		return parentid;
	}

	@Override
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	@Override
	public Long getUpdated() {
		return (updated != null && updated != 0) ? updated : null;
	}

	@Override
	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	@Override
	public String create() {
//		return CoreUtils.getInstance().getDao().create(getAppid(), this);
		return null;
	}

	@Override
	public void update() {
//		CoreUtils.getInstance().getDao().update(getAppid(), this);
	}

	@Override
	public void delete() {
//		CoreUtils.getInstance().getDao().delete(getAppid(), this);
	}

	@Override
	public boolean exists() {
//		return CoreUtils.getInstance().getDao().read(getAppid(), getId()) != null;
		return false;
	}

	@Override
	public boolean voteUp(String userid) {
//		return CoreUtils.getInstance().vote(this, userid, VoteValue.UP);
		return false;
	}

	@Override
	public boolean voteDown(String userid) {
//		return CoreUtils.getInstance().vote(this, userid, VoteValue.DOWN);
		return false;
	}

	@Override
	public Integer getVotes() {
		return (votes == null) ? 0 : votes;
	}

	@Override
	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	@Override
	public Long getVersion() {
		return (version == null) ? 0 : version;
	}

	@Override
	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public Long countLinks(String type2) {
		return null;
//		return CoreUtils.getInstance().countLinks(this, type2);
	}

	@Override
	public List<Linker> getLinks(String type2, Pager... pager) {
		return null;
//		return CoreUtils.getInstance().getLinks(this, type2, pager);
	}

	@Override
	public <P extends ParaObject> List<P> getLinkedObjects(String type, Pager... pager) {
		return null;
//		return CoreUtils.getInstance().getLinkedObjects(this, type, pager);
	}

	@Override
	public <P extends ParaObject> List<P> findLinkedObjects(String type, String field, String query, Pager... pager) {
		return null;
//		return CoreUtils.getInstance().findLinkedObjects(this, type, field, query, pager);
	}

	@Override
	public boolean isLinked(String type2, String id2) {
		return false;
//		return CoreUtils.getInstance().isLinked(this, type2, id2);
	}

	@Override
	public boolean isLinked(ParaObject toObj) {
//		return CoreUtils.getInstance().isLinked(this, toObj);
		return false;
	}

	@Override
	public String link(String id2) {
//		return CoreUtils.getInstance().link(this, id2);
		return null;
	}

	@Override
	public void unlink(String type, String id2) {
//		CoreUtils.getInstance().unlink(this, type, id2);
	}

	@Override
	public void unlinkAll() {
//		CoreUtils.getInstance().unlinkAll(this);
	}

	@Override
	public Long countChildren(String type) {
//		return CoreUtils.getInstance().countChildren(this, type);
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> getChildren(String type, Pager... pager) {
//		return CoreUtils.getInstance().getChildren(this, type, pager);
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> getChildren(String type, String field, String term, Pager... pager) {
//		return CoreUtils.getInstance().getChildren(this, type, field, term, pager);
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> findChildren(String type, String query, Pager... pager) {
//		return CoreUtils.getInstance().findChildren(this, type, query, pager);
		return null;
	}

	@Override
	public void deleteChildren(String type) {
//		CoreUtils.getInstance().deleteChildren(this, type);
	}

	@Override
	public String toString() {
//		return ParaObjectUtils.toJSON(this);
		return null;
	}
}