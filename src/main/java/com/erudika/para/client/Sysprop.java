package com.erudika.para.client;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

/**
 * 
 * @author qhuynh
 * See com/erudika/para/core/Sysprop.java
 */
public class Sysprop implements ParaObject, Serializable {
	private String id;
	private String name;
        private Long timestamp;
        private String type;
        private String appid;
        private String parentid;
        private String creatorid;
        private Long updated;
        private List<String> tags;
        private Integer votes;
        private Long version;
        private Boolean stored;
        private Boolean indexed;
        private Boolean cached;
        private Map<String, Object> properties;

	
    /**
     * No-args constructor.
     */
    public Sysprop() {
            this(null);
    }
    
    public Long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
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

	public void setUpdated(Long updated) {
		this.updated = updated;
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


	public String getCreatorid() {
		return creatorid;
	}


	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}


	public void setCreatorid(String creatorid) {
            this.creatorid = creatorid;
    }

    /**
     * Adds a new key/value pair to the map.
     * @param name a key
     * @param value a value
     * @return this
     */
    @JsonAnySetter
    public Sysprop addProperty(String name, Object value) {
            if (!StringUtils.isBlank(name) && value != null) {
                    getProperties().put(name, value);
            }
            return this;
    }

    /**
     * The default constructor.
     * @param id the object id
     */
    public Sysprop(String id) {
            setId(id);
            setName(getName());
    }

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
     * A map of all properties (key/values).
     * @return a map
     */
    @JsonAnyGetter
    public Map<String, Object> getProperties() {
            if (properties == null) {
                    properties = new HashMap<>();
            }
            return properties;
    }

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


	public void setType(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPlural() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getUpdated() {
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

	public Object getProperty(String emailToken) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasProperty(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public void removeProperty(String name2) {
		// TODO Auto-generated method stub
		
	}

}
