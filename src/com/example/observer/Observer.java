package com.example.observer;

import java.util.ArrayList;
import java.util.List;

public interface Observer {
    void update();
}
class User implements Observer{

    private String name;

    public User(String name){
        this.name=name;
    }

    @Override
    public void update() {
        System.out.println(name+" recives the notification");
    }
}

class YoutubeChannel{
    List<Observer> subscribers=new ArrayList<>();
    void subscribe(Observer observer){
        subscribers.add(observer);
    }

    void uploadVideo(){

        System.out.println("new video uploaded");
        for(Observer observer:subscribers){
            observer.update();
        }

    }
}

class Main{

    public static void main(String[] args) {

        YoutubeChannel channel=new YoutubeChannel();
        channel.subscribe(new User("Ram"));
        channel.subscribe(new User("Rahul"));
        channel.subscribe(new User("Rakesh"));
        channel.uploadVideo();
    }


}


