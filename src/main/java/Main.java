import rx.Observable;
import rx.functions.Func1;

public class Main {

  public static void main (String[] args) {
    Observable.just("Hello, world!")
            .map(s -> s + " -Ken")
            .subscribe(s -> System.out.println(s));
  }
}
