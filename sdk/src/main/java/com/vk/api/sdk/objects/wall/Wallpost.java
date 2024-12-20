// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.wall;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.events.CallbackEvent;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.LikesInfo;
import com.vk.api.sdk.objects.base.RepostsInfo;

import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * Wallpost object
 */
public class Wallpost implements Validable, CallbackEvent {
    /**
     * Access key to private object
     */
    @SerializedName("access_key")
    private String accessKey;

    @SerializedName("attachments")
    private List<WallpostAttachment> attachments;

    /**
     * Information about the source of the post
     */
    @SerializedName("copyright")
    private PostCopyright copyright;

    /**
     * Date of publishing in Unixtime
     */
    @SerializedName("date")
    private Integer date;

    @SerializedName("deleted_details")
    private String deletedDetails;

    @SerializedName("deleted_reason")
    private String deletedReason;

    @SerializedName("donut_miniapp_url")
    private URI donutMiniappUrl;

    /**
     * Date of editing in Unixtime
     */
    @SerializedName("edited")
    private Integer edited;

    /**
     * Post author ID
     * Entity: owner
     */
    @SerializedName("from_id")
    private Long fromId;

    @SerializedName("geo")
    private Geo geo;

    /**
     * Post ID
     */
    @SerializedName("id")
    private Integer id;

    @SerializedName("inner_type")
    @Required
    private WallpostInnerType innerType;

    /**
     * Is post archived, only for post owners
     */
    @SerializedName("is_archived")
    private Boolean isArchived;

    @SerializedName("is_deleted")
    private Boolean isDeleted;

    /**
     * Information whether the post in favorites list
     */
    @SerializedName("is_favorite")
    private Boolean isFavorite;

    /**
     * Count of likes
     */
    @SerializedName("likes")
    private LikesInfo likes;

    /**
     * Wall owner's ID
     * Entity: owner
     */
    @SerializedName("owner_id")
    private Long ownerId;

    /**
     * If post type 'reply', contains original parent IDs stack
     */
    @SerializedName("parents_stack")
    private List<Integer> parentsStack;

    /**
     * If post type 'reply', contains original post ID
     */
    @SerializedName("post_id")
    private Integer postId;

    @SerializedName("post_source")
    private PostSource postSource;

    @SerializedName("post_type")
    private PostType postType;

    @SerializedName("reposts")
    private RepostsInfo reposts;

    /**
     * Post signer ID
     * Entity: owner
     */
    @SerializedName("signer_id")
    private Long signerId;

    /**
     * Post text
     */
    @SerializedName("text")
    private String text;

    /**
     * Count of views
     */
    @SerializedName("views")
    private Views views;

    public String getAccessKey() {
        return accessKey;
    }

    public Wallpost setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public List<WallpostAttachment> getAttachments() {
        return attachments;
    }

    public Wallpost setAttachments(List<WallpostAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    public PostCopyright getCopyright() {
        return copyright;
    }

    public Wallpost setCopyright(PostCopyright copyright) {
        this.copyright = copyright;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Wallpost setDate(Integer date) {
        this.date = date;
        return this;
    }

    public String getDeletedDetails() {
        return deletedDetails;
    }

    public Wallpost setDeletedDetails(String deletedDetails) {
        this.deletedDetails = deletedDetails;
        return this;
    }

    public String getDeletedReason() {
        return deletedReason;
    }

    public Wallpost setDeletedReason(String deletedReason) {
        this.deletedReason = deletedReason;
        return this;
    }

    public URI getDonutMiniappUrl() {
        return donutMiniappUrl;
    }

    public Wallpost setDonutMiniappUrl(URI donutMiniappUrl) {
        this.donutMiniappUrl = donutMiniappUrl;
        return this;
    }

    public Integer getEdited() {
        return edited;
    }

    public Wallpost setEdited(Integer edited) {
        this.edited = edited;
        return this;
    }

    public Long getFromId() {
        return fromId;
    }

    public Wallpost setFromId(Long fromId) {
        this.fromId = fromId;
        return this;
    }

    public Geo getGeo() {
        return geo;
    }

    public Wallpost setGeo(Geo geo) {
        this.geo = geo;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Wallpost setId(Integer id) {
        this.id = id;
        return this;
    }

    public WallpostInnerType getInnerType() {
        return innerType;
    }

    public Wallpost setInnerType(WallpostInnerType innerType) {
        this.innerType = innerType;
        return this;
    }

    public Boolean getIsArchived() {
        return isArchived;
    }

    public Wallpost setIsArchived(Boolean isArchived) {
        this.isArchived = isArchived;
        return this;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public Wallpost setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Boolean getIsFavorite() {
        return isFavorite;
    }

    public Wallpost setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
        return this;
    }

    public LikesInfo getLikes() {
        return likes;
    }

    public Wallpost setLikes(LikesInfo likes) {
        this.likes = likes;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Wallpost setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public List<Integer> getParentsStack() {
        return parentsStack;
    }

    public Wallpost setParentsStack(List<Integer> parentsStack) {
        this.parentsStack = parentsStack;
        return this;
    }

    public Integer getPostId() {
        return postId;
    }

    public Wallpost setPostId(Integer postId) {
        this.postId = postId;
        return this;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public Wallpost setPostSource(PostSource postSource) {
        this.postSource = postSource;
        return this;
    }

    public PostType getPostType() {
        return postType;
    }

    public Wallpost setPostType(PostType postType) {
        this.postType = postType;
        return this;
    }

    public RepostsInfo getReposts() {
        return reposts;
    }

    public Wallpost setReposts(RepostsInfo reposts) {
        this.reposts = reposts;
        return this;
    }

    public Long getSignerId() {
        return signerId;
    }

    public Wallpost setSignerId(Long signerId) {
        this.signerId = signerId;
        return this;
    }

    public String getText() {
        return text;
    }

    public Wallpost setText(String text) {
        this.text = text;
        return this;
    }

    public Views getViews() {
        return views;
    }

    public Wallpost setViews(Views views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, copyright, attachments, isArchived, ownerId, geo, deletedReason, parentsStack, isDeleted, id, text, donutMiniappUrl, views, likes, postType, edited, deletedDetails, postSource, postId, fromId, signerId, accessKey, innerType, reposts, isFavorite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wallpost wallpost = (Wallpost) o;
        return Objects.equals(date, wallpost.date) &&
                Objects.equals(copyright, wallpost.copyright) &&
                Objects.equals(donutMiniappUrl, wallpost.donutMiniappUrl) &&
                Objects.equals(attachments, wallpost.attachments) &&
                Objects.equals(fromId, wallpost.fromId) &&
                Objects.equals(isFavorite, wallpost.isFavorite) &&
                Objects.equals(ownerId, wallpost.ownerId) &&
                Objects.equals(deletedDetails, wallpost.deletedDetails) &&
                Objects.equals(geo, wallpost.geo) &&
                Objects.equals(isDeleted, wallpost.isDeleted) &&
                Objects.equals(innerType, wallpost.innerType) &&
                Objects.equals(deletedReason, wallpost.deletedReason) &&
                Objects.equals(postType, wallpost.postType) &&
                Objects.equals(id, wallpost.id) &&
                Objects.equals(text, wallpost.text) &&
                Objects.equals(views, wallpost.views) &&
                Objects.equals(likes, wallpost.likes) &&
                Objects.equals(signerId, wallpost.signerId) &&
                Objects.equals(edited, wallpost.edited) &&
                Objects.equals(parentsStack, wallpost.parentsStack) &&
                Objects.equals(isArchived, wallpost.isArchived) &&
                Objects.equals(postId, wallpost.postId) &&
                Objects.equals(postSource, wallpost.postSource) &&
                Objects.equals(accessKey, wallpost.accessKey) &&
                Objects.equals(reposts, wallpost.reposts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Wallpost{");
        sb.append("date=").append(date);
        sb.append(", copyright=").append(copyright);
        sb.append(", donutMiniappUrl=").append(donutMiniappUrl);
        sb.append(", attachments=").append(attachments);
        sb.append(", fromId=").append(fromId);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", deletedDetails='").append(deletedDetails).append("'");
        sb.append(", geo=").append(geo);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", innerType='").append(innerType).append("'");
        sb.append(", deletedReason='").append(deletedReason).append("'");
        sb.append(", postType=").append(postType);
        sb.append(", id=").append(id);
        sb.append(", text='").append(text).append("'");
        sb.append(", views=").append(views);
        sb.append(", likes=").append(likes);
        sb.append(", signerId=").append(signerId);
        sb.append(", edited=").append(edited);
        sb.append(", parentsStack=").append(parentsStack);
        sb.append(", isArchived=").append(isArchived);
        sb.append(", postId=").append(postId);
        sb.append(", postSource=").append(postSource);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append(", reposts=").append(reposts);
        sb.append('}');
        return sb.toString();
    }
}
