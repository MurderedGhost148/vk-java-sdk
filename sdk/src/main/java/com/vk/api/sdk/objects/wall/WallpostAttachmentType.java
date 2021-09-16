// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.wall;

import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.queries.EnumParam;

/**
 * Attachment type
 */
public enum WallpostAttachmentType implements EnumParam {
    @SerializedName("photo")
    PHOTO("photo"),

    @SerializedName("posted_photo")
    POSTED_PHOTO("posted_photo"),

    @SerializedName("audio")
    AUDIO("audio"),

    @SerializedName("video")
    VIDEO("video"),

    @SerializedName("doc")
    DOC("doc"),

    @SerializedName("link")
    LINK("link"),

    @SerializedName("graffiti")
    GRAFFITI("graffiti"),

    @SerializedName("note")
    NOTE("note"),

    @SerializedName("app")
    APP("app"),

    @SerializedName("poll")
    POLL("poll"),

    @SerializedName("page")
    PAGE("page"),

    @SerializedName("album")
    ALBUM("album"),

    @SerializedName("photos_list")
    PHOTOS_LIST("photos_list"),

    @SerializedName("market_market_album")
    MARKET_MARKET_ALBUM("market_market_album"),

    @SerializedName("market")
    MARKET("market"),

    @SerializedName("event")
    EVENT("event"),

    @SerializedName("donut_link")
    DONUT_LINK("donut_link"),

    @SerializedName("article")
    ARTICLE("article"),

    @SerializedName("textlive")
    TEXTLIVE("textlive"),

    @SerializedName("textpost")
    TEXTPOST("textpost"),

    @SerializedName("situational_theme")
    SITUATIONAL_THEME("situational_theme"),

    @SerializedName("group")
    GROUP("group"),

    @SerializedName("sticker")
    STICKER("sticker");

    private final String value;

    WallpostAttachmentType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toLowerCase();
    }
}
