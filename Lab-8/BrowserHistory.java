package Lesson9;

import java.util.Stack;

public class BrowserHistory {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String curentUrl ;

    public BrowserHistory(String curentUrl){
        this.curentUrl = curentUrl;
    }

    public  void Visit (String url){
        backStack.push(curentUrl);
        curentUrl = url;
        forwardStack.clear();
        System.out.println("Current URL Page " + " " + curentUrl);

    }

    public void Back (){
        if (backStack.isEmpty()){
            System.out.println("ther is no browser history");
        } else {
            forwardStack.push(curentUrl);
            curentUrl=backStack.pop();
            System.out.println("Back to" + " " + curentUrl);
        }

    }

    public void forward(){
        if ( forwardStack.isEmpty()){
            System.out.println("there is no urls in forward");
        }
else{
    backStack.push(curentUrl);
            curentUrl=forwardStack.peek();
            System.out.println("Forward to: " + " " + curentUrl);}

    }
    public static void main(String[] args) {
        BrowserHistory browser = new
                BrowserHistory("home.html");// Start with home.html
        browser.Visit("page1.html"); // Current URL Page page1.html
        browser.Visit("page2.html"); // Current URL Pag page2.html
        browser.Back(); // Back to: page1.html
        browser.Back(); // Back to: home.html

        browser.Back(); // Back to: home.html

        browser.forward(); // Forward to: page2.html
        browser.forward(); // Forward to: page2.html
        browser.forward();//No forward history.
        browser.Visit("page3.html"); // Current URL page
    }
}

