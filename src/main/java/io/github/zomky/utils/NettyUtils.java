package io.github.zomky.utils;

import io.netty.buffer.ByteBuf;

public class NettyUtils {

    public static byte[] toByteArray(ByteBuf byteBuf) {
        if(byteBuf.hasArray()) {
            return byteBuf.array();
        }
        byte[] bytes = new byte[byteBuf.readableBytes()];
        byteBuf.getBytes(byteBuf.readerIndex(), bytes);
        return bytes;
    }

}
