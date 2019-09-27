package com.erudika.para.client;

import java.util.EnumSet;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 
 * @author qhuynh
 *
 */
public class App {
    /**
     * {@value #APP_ROLE}.
     */
    public static final String APP_ROLE = "ROLE_APP";
    /**
     * {@value #ALLOW_ALL}.
     */
    public static final String ALLOW_ALL = "*";
	
	/**
	 * Represents HTTP methods allowed to be executed on a specific resource/type.
	 * For example; the 'books' type can have a permission '{ "*" : ["GET"] }' which means
	 * "give read-only permissions to everyone". It is backed by a map of resource names
	 * (object types) to a set of allowed HTTP methods.
	 */
	public enum AllowedMethods {

		/**
		 * Allow unauthenticated requests (guest access).
		 */
		GUEST,
		/**
		 * Deny all requests (no access).
		 */
		EMPTY,
		/**
		 * Restrict access to objects with creatorid matching that of auth user.
		 */
		OWN,
		/**
		 * Allows all HTTP methods (full access).
		 */
		READ_WRITE,
		/**
		 * Allows GET method only.
		 */
		GET,
		/**
		 * Allows POST method only.
		 */
		POST,
		/**
		 * Allows PUT method only.
		 */
		PUT,
		/**
		 * ALlows PATCH method only.
		 */
		PATCH,
		/**
		 * Allows DELETE method only.
		 */
		DELETE,
		/**
		 * Allows read methods: GET, same as {@link #GET}.
		 */
		READ_ONLY,
		/**
		 * Allows write methods: POST, PUT, PATCH and DELETE.
		 */
		WRITE_ONLY;

		/**
		 * All methods allowed.
		 */
		public static final EnumSet<AllowedMethods> ALL = EnumSet.of(GET, POST, PUT, PATCH, DELETE);
		/**
		 * All methods allowed (*).
		 */
		public static final EnumSet<AllowedMethods> READ_AND_WRITE = EnumSet.of(READ_WRITE);
		/**
		 * Only GET is allowed.
		 */
		public static final EnumSet<AllowedMethods> READ = EnumSet.of(GET);
		/**
		 * All methods allowed, except GET.
		 */
		public static final EnumSet<AllowedMethods> WRITE = EnumSet.of(POST, PUT, PATCH, DELETE);
		/**
		 * All methods allowed, except DELETE.
		 */
		public static final EnumSet<AllowedMethods> ALL_EXCEPT_DELETE = EnumSet.of(GET, POST, PUT, PATCH);
		/**
		 * No methods allowed.
		 */
		public static final EnumSet<AllowedMethods> NONE = EnumSet.of(EMPTY);

		/**
		 * Constructs the enum from a string value.
		 * @param value a method name, or ?,w
		 * @return an enum instance
		 */
		@JsonCreator
		public static AllowedMethods fromString(String value) {
			if (ALLOW_ALL.equals(value)) {
				return READ_WRITE;
			} else if ("w".equals(value)) {
				return WRITE_ONLY;
			} else if ("?".equals(value)) {
				return GUEST;
			} else {
				try {
					return valueOf(value.toUpperCase());
				} catch (Exception e) {
					return EMPTY;
				}
			}
		}

		@Override
		@JsonValue
		public String toString() {
			switch (this) {
				case READ_WRITE:
					return ALLOW_ALL;
				case READ_ONLY:
					return GET.name();
				case GUEST:
					return "?";
				case EMPTY:
					return "-";
				case WRITE_ONLY:
					return "w";
				default:
					return this.name();
			}
		}
	}

	public Map<? extends String, ? extends String> getDatatypes() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String id(String appid) {
		// TODO Auto-generated method stub
		return null;
	}
}
