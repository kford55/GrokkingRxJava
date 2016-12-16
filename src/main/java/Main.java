import rx.Observable;

public class Main {

  public static void main (String[] args) {
    Observable.just("Hello, world!")
            .subscribe(s -> System.out.println(s));
  }
}
