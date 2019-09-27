package com.erudika.para.client;


public interface Votable {

	/**
	 * The type of vote (negative or positive).
	 */
	enum VoteValue {
		/**
		 * Positive vote +1.
		 */
		UP(1),
		/**
		 * Negative vote -1.
		 */
		DOWN(-1);

		private final int value;

		VoteValue(int v) {
			this.value = v;
		}

		/**
		 * @return -1 if DOWN, 1 if UP
		 */
		public int getValue() {
			return value;
		}

		public String toString() {
			return name().toLowerCase();
		}
	}

	/**
	 * Upvotes the object.
	 * @param userid id of voter
	 * @return true if successful
	 */
	boolean voteUp(String userid);

	/**
	 * Downvotes the object.
	 * @param userid id of voter
	 * @return true if successful
	 */
	boolean voteDown(String userid);

	/**
	 * Returns the total sum of all votes for this object.
	 * For example: (+6) + (-4) = 2
	 * @return the total sum of votes
	 */
	Integer getVotes();

	/**
	 * Sets the total votes for this object.
	 * @param votes the number of votes
	 */
	void setVotes(Integer votes);

}
