package 剑指offer;

public class Test02 {
	
	public static class Sington{
		private final static Sington INSTANCE = new Sington();
		
		public static Sington getInstance(){
			return INSTANCE;
		}
	}
	
	
	public static class Sington2{
		private final static Sington2 INSTANCE;
		static {
			INSTANCE = new Sington2();
		}
		
		public static Sington2 getInstance(){
			return INSTANCE;
		}
	}
	
	
	public static class Singleton3{
		private volatile static Singleton3 instance;
		
	
		public static Singleton3 getInstance(){
			if (instance != null){
				return instance;
			} else{
				synchronized (Singleton3.class) {
					if(instance == null){
						instance = new Singleton3();
					}
					return instance;
				}
			}
		}
	}

}
