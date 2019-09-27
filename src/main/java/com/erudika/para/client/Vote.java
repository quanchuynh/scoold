package com.erudika.para.client;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;

import com.erudika.para.client.Votable.VoteValue;
import static com.erudika.para.client.Votable.VoteValue.DOWN;
import static com.erudika.para.client.Votable.VoteValue.UP;


public class Vote implements ParaObject {
	private static final long serialVersionUID = 1L;

	@Stored private String id;
	@Stored private Long timestamp;
	@Stored private String type;
	@Stored private String appid;
	@Stored private String parentid;
	@Stored private String creatorid;
	@Stored private Long updated;
	@Stored private String name;
	@Stored private Long version;
	@Stored private Boolean stored;
	@Stored private Boolean indexed;
	@Stored private Boolean cached;

	@Stored private String value;
	@Stored private Long expiresAfter;

	/**
	 * No-args constructor.
	 */
	public Vote() {
		this(null, null, null);
	}

	/**
	 * Default constructor.
	 * @param voterid the user id of the voter
	 * @param voteeid the id of the object that will receive the vote
	 * @param value up + or down -
	 */
	public Vote(String voterid, String voteeid, VoteValue value) {
		creatorid = voterid;
		parentid = voteeid;
		timestamp = Utils.timestamp();
		setName(getType());
		this.value = value != null ? value.toString() : null;
		this.expiresAfter = (long) Config.VOTE_EXPIRES_AFTER_SEC;
	}

	@Override
	public final String getId() {
		if (getCreatorid() != null && getParentid() != null && this.id == null) {
			this.id = getType().concat(Config.SEPARATOR).concat(getCreatorid()).
					concat(Config.SEPARATOR).concat(getParentid());
		}
		return this.id;
	}

	/**
	 * Set the vote positive.
	 * @return this
	 */
	public Vote up() {
		this.value = UP.toString();
		return this;
	}

	/**
	 * Set the vote negative.
	 * @return this
	 */
	public Vote down() {
		this.value = DOWN.toString();
		return this;
	}

	/**
	 * @return true if vote is positive
	 */
	public boolean isUpvote() {
		return StringUtils.equals(this.value, UP.toString());
	}

	/**
	 * @return true if vote is negative
	 */
	public boolean isDownvote() {
		return StringUtils.equals(this.value, DOWN.toString());
	}

	/**
	 * Returns the value of the vote.
	 * @return UP or DOWN
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the vote.
	 * @param value UP or DOWN
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Returns the expiration period.
	 * @return time in seconds
	 */
	public Long getExpiresAfter() {
		if (expiresAfter == null) {
			expiresAfter = (long) Config.VOTE_EXPIRES_AFTER_SEC;
		}
		return expiresAfter;
	}

	/**
	 * Sets the expiration period.
	 * @param expiresAfter time in seconds
	 */
	public void setExpiresAfter(Long expiresAfter) {
		this.expiresAfter = expiresAfter;
	}

	/**
	 * Checks if expired.
	 * @return true if expired
	 */
	public boolean isExpired() {
		if (getTimestamp() == null || getExpiresAfter() == 0) {
			return false;
		}
		long expires = (getExpiresAfter() * 1000);
		long now = Utils.timestamp();
		return (getTimestamp() + expires) <= now;
	}

	/**
	 * Checks if vote can still be amended.
	 * @return true if vote can still be changed
	 */
	public boolean isAmendable() {
		if (getTimestamp() == null) {
			return false;
		}
		long now = Utils.timestamp();
		// check timestamp for recent correction,
		return (getTimestamp() + (Config.VOTE_LOCKED_AFTER_SEC * 1000)) > now;
	}

	////////////////////////////////////////////////////////

	@Override
	public final void setId(String id) {
		this.id = id;
	}

	@Override
	public final String getType() {
		return Utils.type(this.getClass());
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
	public String getObjectURI() {
		return null;
//		return CoreUtils.getInstance().getObjectURI(this);
	}

	@Override
	public List<String> getTags() {
		return Collections.emptyList();
	}

	@Override
	public void setTags(List<String> tags) {
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
		return false;
	}

	@Override
	public boolean voteDown(String userid) {
		return false;
	}

	@Override
	public Integer getVotes() {
		return 0;
	}

	@Override
	public void setVotes(Integer votes) {
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
		return 0L;
	}

	@Override
	public List<Linker> getLinks(String type2, Pager... pager) {
		return Collections.emptyList();
	}

	@Override
	public <P extends ParaObject> List<P> getLinkedObjects(String type, Pager... pager) {
		return Collections.emptyList();
	}

	@Override
	public <P extends ParaObject> List<P> findLinkedObjects(String type, String field, String query, Pager... pager) {
		return Collections.emptyList();
	}

	@Override
	public boolean isLinked(String type2, String id2) {
		return false;
	}

	@Override
	public boolean isLinked(ParaObject toObj) {
		return false;
	}

	@Override
	public String link(String id2) {
		return null;
	}

	@Override
	public void unlink(String type, String id2) {
	}

	@Override
	public void unlinkAll() {
	}

	@Override
	public Long countChildren(String type) {
		return 0L;
	}

	@Override
	public <P extends ParaObject> List<P> getChildren(String type, Pager... pager) {
		return Collections.emptyList();
	}

//	@Override
//	public <P extends ParaObject> List<P> getChildren(String type, String field, String term, Pager... pager) {
//		return Collections.emptyList();
//	}

	@Override
	public <P extends ParaObject> List<P> findChildren(String type, String query, Pager... pager) {
		return Collections.emptyList();
	}

	@Override
	public void deleteChildren(String type) {
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.value);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Vote other = (Vote) obj;
		return Objects.equals(this.id, other.getId()) && Objects.equals(this.value, other.getValue());
	}

	@Override
	public String toString() {
//		return ParaObjectUtils.toJSON(this);
		return null;
	}

	@Override
	public <P extends ParaObject> List<P> getChildren(String type, String field, String term, Pager... pager) {
		// TODO Auto-generated method stub
		return null;
	}
}
