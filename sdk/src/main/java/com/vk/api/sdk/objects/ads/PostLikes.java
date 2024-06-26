// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.ads;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * Likes
 */
public class PostLikes implements Validable {
    /**
     * Can like
     */
    @SerializedName("can_like")
    private Integer canLike;

    /**
     * Count
     */
    @SerializedName("count")
    private Integer count;

    /**
     * User likes
     */
    @SerializedName("user_likes")
    private Integer userLikes;

    public Integer getCanLike() {
        return canLike;
    }

    public PostLikes setCanLike(Integer canLike) {
        this.canLike = canLike;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public PostLikes setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getUserLikes() {
        return userLikes;
    }

    public PostLikes setUserLikes(Integer userLikes) {
        this.userLikes = userLikes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(canLike, count, userLikes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostLikes postLikes = (PostLikes) o;
        return Objects.equals(userLikes, postLikes.userLikes) &&
                Objects.equals(canLike, postLikes.canLike) &&
                Objects.equals(count, postLikes.count);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("PostLikes{");
        sb.append("userLikes=").append(userLikes);
        sb.append(", canLike=").append(canLike);
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}