package com.erudika.para.client;

import java.util.List;

/**
 * 
 * @author qhuynh
 * See com/erudika/para/core/User.java
 */
public class User implements ParaObject {
	private String id;
	private Long timestamp;
	private String type;
	private String appid;
	private String parentid;
	private String creatorid;
	private Long updated;
	private String name;
	private List<String> tags;
	private Integer votes;
	private Long version;
	private Boolean stored;
	private Boolean indexed;
	private Boolean cached;

	private String identifier;
	private String groups;
	private Boolean active;
	private Boolean twoFA;
	private String twoFAkey;
	private String twoFAbackupKeyHash;
	private String email;
	private String currency;
	private String picture;
	private String lastIp;
	private String tokenSecret;

	private transient String password;

	public User(String creatorid2) {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}

	public String getParentid() {
		return parentid;
	}

	public void setParentid(String parentid) {
		this.parentid = parentid;
	}

	public String getCreatorid() {
		return creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public Long getUpdated() {
		return updated;
	}

	public void setUpdated(Long updated) {
		this.updated = updated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Integer getVotes() {
		return votes;
	}

	public void setVotes(Integer votes) {
		this.votes = votes;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Boolean getStored() {
		return stored;
	}

	public void setStored(Boolean stored) {
		this.stored = stored;
	}

	public Boolean getIndexed() {
		return indexed;
	}

	public void setIndexed(Boolean indexed) {
		this.indexed = indexed;
	}

	public Boolean getCached() {
		return cached;
	}

	public void setCached(Boolean cached) {
		this.cached = cached;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getGroups() {
		return groups;
	}

	public void setGroups(String groups) {
		this.groups = groups;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Boolean getTwoFA() {
		return twoFA;
	}

	public void setTwoFA(Boolean twoFA) {
		this.twoFA = twoFA;
	}

	public String getTwoFAkey() {
		return twoFAkey;
	}

	public void setTwoFAkey(String twoFAkey) {
		this.twoFAkey = twoFAkey;
	}

	public String getTwoFAbackupKeyHash() {
		return twoFAbackupKeyHash;
	}

	public void setTwoFAbackupKeyHash(String twoFAbackupKeyHash) {
		this.twoFAbackupKeyHash = twoFAbackupKeyHash;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	public String getTokenSecret() {
		return tokenSecret;
	}

	public void setTokenSecret(String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getObjectURI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPlural() {
		// TODO Auto-generated method stub
		return null;
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

	public Object getIdentityProvider() {
		// TODO Auto-generated method stub
		return null;
	}

    /**
     * Simple groups enum.
     */
    public enum Groups {
        /**
         * The standard user group.
         */
        USERS,
        /**
         * Moderators group.
         */
        MODS,
        /**
         * Administrators group.
         */
        ADMINS;

        @Override
        public String toString() {
            return this.name().toLowerCase();
        }
    }

}
