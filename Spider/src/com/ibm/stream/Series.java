package com.ibm.stream;

public class Series extends Media{
		private int seasons;
		private int episodes;
		
		public Series() {
		}

		public Series(String title, String genere, boolean free, int seasons, int episodes) {
			super(title, genere, free);
			this.seasons = seasons;
			this.episodes = episodes;
		}

		@Override
		public void play(User user) throws AgeRestrictionException, SubscriptionException {
			super.play(user);
		}
		
		
		
		
		
}
