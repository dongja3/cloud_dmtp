package com.dongja3.dmtp.domain.pipe;

import com.dongja3.dmtp.domain.ProcessUnit;
import com.dongja3.dmtp.domain.channel.Channel;

/**
 * Created by DONGJA3 on 6/12/2017.
 */
public abstract class Pipe extends ProcessUnit {
    private String fileNamePattern;
    private int timeout;
    private Channel channel;

    public String getFileNamePattern() {
        return fileNamePattern;
    }

    public void setFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }
}
