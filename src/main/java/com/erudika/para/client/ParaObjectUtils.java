package com.erudika.para.client;

import java.util.Map;

import com.erudika.scoold.core.Comment;
import com.erudika.scoold.core.Post;
import com.erudika.scoold.core.Profile;
import com.fasterxml.jackson.databind.ObjectReader;

public class ParaObjectUtils {
    /**
     * @see #setAnnotatedFields(com.erudika.para.core.ParaObject, java.util.Map, java.lang.Class)
     * @param <P> the object type
     * @param data the map of fields/values
     * @return the populated object
     */
    public static <P extends ParaObject> P setAnnotatedFields(Map<String, Object> data) {
    	return null;
//            return setAnnotatedFields(null, data, null);
    }

	public static boolean typesMatch(Comment showComment) {
		// TODO Auto-generated method stub
		return false;
	}

	public static ObjectReader getJsonReader(Class<Map> class1) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean typesMatch(Post showPost) {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean typesMatch(Profile showUser) {
		// TODO Auto-generated method stub
		return false;
	}
}
