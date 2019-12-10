package in.org.subh.learn.ocjp6;
public class Question135 {
	int squares = 81;

	public static void main(String[] args) {
		new Question135().go();
		
		/*try{
			
		}
		catch(Exception e){
			System.out.println();
		}
		catch(Exception e){
			System.out.println();
		}
		finally{
			System.out.println("hello finaly");
		}*/
	}

	void go() {
		incr(++squares);
		System.out.println(squares);
	}

	void incr(int squares) {
		squares += 10;
	}
}