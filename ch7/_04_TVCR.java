package ch7;

public class _04_TVCR extends Tv_2 {
    VCR vcr = new VCR(); // VCR 클래스를 포함시켜서 사용한다.

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}

class Tv_2 {
    boolean power;      // 전원상태 (on/off)
    int channel;        // 채널

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { power = !power; }
    void play() { /* 내용 생략 */ }
    void stop() { /* 내용 생략 */ }
    void rew() { /* 내용 생략 */ }
    void ff() { /* 내용 생략 */ }
}