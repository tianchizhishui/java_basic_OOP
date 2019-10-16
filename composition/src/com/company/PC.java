package com.company;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MatherBoard matherboard;

    public PC(Case theCase, Monitor monitor, MatherBoard matherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.matherboard = matherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}
