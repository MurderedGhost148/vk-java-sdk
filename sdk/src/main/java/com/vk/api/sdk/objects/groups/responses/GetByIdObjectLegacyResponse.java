// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.audio.Audio;
import com.vk.api.sdk.objects.base.BaseObject;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.base.Country;
import com.vk.api.sdk.objects.base.CropPhoto;
import com.vk.api.sdk.objects.groups.AddressesInfo;
import com.vk.api.sdk.objects.groups.ContactsItem;
import com.vk.api.sdk.objects.groups.CountersGroup;
import com.vk.api.sdk.objects.groups.Cover;
import com.vk.api.sdk.objects.groups.Group;
import com.vk.api.sdk.objects.groups.GroupBanInfo;
import com.vk.api.sdk.objects.groups.GroupFullAgeLimits;
import com.vk.api.sdk.objects.groups.GroupFullMemberStatus;
import com.vk.api.sdk.objects.groups.GroupFullSection;
import com.vk.api.sdk.objects.groups.LinksItem;
import com.vk.api.sdk.objects.groups.LiveCovers;
import com.vk.api.sdk.objects.groups.MarketInfo;
import com.vk.api.sdk.objects.groups.OnlineStatus;
import java.util.List;
import java.util.Objects;

/**
 * GetByIdObjectLegacyResponse object
 */
public class GetByIdObjectLegacyResponse extends Group implements Validable {
    @SerializedName("market")
    private MarketInfo market;

    /**
     * Current user's member status
     */
    @SerializedName("member_status")
    private GroupFullMemberStatus memberStatus;

    /**
     * Information whether community is adult
     */
    @SerializedName("is_adult")
    private BoolInt isAdult;

    /**
     * Information whether community is hidden from current user's newsfeed
     */
    @SerializedName("is_hidden_from_feed")
    private BoolInt isHiddenFromFeed;

    /**
     * Information whether community is in faves
     */
    @SerializedName("is_favorite")
    private BoolInt isFavorite;

    /**
     * Information whether current user is subscribed
     */
    @SerializedName("is_subscribed")
    private BoolInt isSubscribed;

    @SerializedName("city")
    private BaseObject city;

    @SerializedName("country")
    private Country country;

    /**
     * Information whether community is verified
     */
    @SerializedName("verified")
    private BoolInt verified;

    /**
     * Community description
     */
    @SerializedName("description")
    private String description;

    /**
     * Community's main wiki page title
     */
    @SerializedName("wiki_page")
    private String wikiPage;

    /**
     * Community members number
     */
    @SerializedName("members_count")
    private Integer membersCount;

    /**
     * The number of incoming requests to the community
     */
    @SerializedName("requests_count")
    private Integer requestsCount;

    /**
     * Community level live streams achievements
     */
    @SerializedName("video_live_level")
    private Integer videoLiveLevel;

    /**
     * Number of community's live streams
     */
    @SerializedName("video_live_count")
    private Integer videoLiveCount;

    /**
     * Number of community's clips
     */
    @SerializedName("clips_count")
    private Integer clipsCount;

    @SerializedName("counters")
    private CountersGroup counters;

    @SerializedName("cover")
    private Cover cover;

    /**
     * Information whether current user can post on community's wall
     */
    @SerializedName("can_post")
    private BoolInt canPost;

    @SerializedName("can_suggest")
    private BoolInt canSuggest;

    /**
     * Information whether current user can upload story
     */
    @SerializedName("can_upload_story")
    private BoolInt canUploadStory;

    /**
     * Information whether current user can upload doc
     */
    @SerializedName("can_upload_doc")
    private BoolInt canUploadDoc;

    /**
     * Information whether current user can upload video
     */
    @SerializedName("can_upload_video")
    private BoolInt canUploadVideo;

    /**
     * Information whether current user can see all posts on community's wall
     */
    @SerializedName("can_see_all_posts")
    private BoolInt canSeeAllPosts;

    /**
     * Information whether current user can create topic
     */
    @SerializedName("can_create_topic")
    private BoolInt canCreateTopic;

    /**
     * Type of group, start date of event or category of public page
     */
    @SerializedName("activity")
    private String activity;

    /**
     * Fixed post ID
     */
    @SerializedName("fixed_post")
    private Integer fixedPost;

    /**
     * Information whether community has photo
     */
    @SerializedName("has_photo")
    private BoolInt hasPhoto;

    /**
     * Данные о точках, по которым вырезаны профильная и миниатюрная фотографии сообщества
     */
    @SerializedName("crop_photo")
    private CropPhoto cropPhoto;

    /**
     * Community status
     */
    @SerializedName("status")
    private String status;

    @SerializedName("status_audio")
    private Audio statusAudio;

    /**
     * Community's main photo album ID
     */
    @SerializedName("main_album_id")
    private Integer mainAlbumId;

    @SerializedName("links")
    private List<LinksItem> links;

    @SerializedName("contacts")
    private List<ContactsItem> contacts;

    /**
     * Information about wall status in community
     */
    @SerializedName("wall")
    private GetByIdObjectLegacyResponseWall wall;

    /**
     * Community's website
     */
    @SerializedName("site")
    private String site;

    @SerializedName("main_section")
    private GroupFullSection mainSection;

    @SerializedName("secondary_section")
    private GroupFullSection secondarySection;

    /**
     * Information whether the community has a "fire" pictogram.
     */
    @SerializedName("trending")
    private BoolInt trending;

    /**
     * Information whether current user can send a message to community
     */
    @SerializedName("can_message")
    private BoolInt canMessage;

    /**
     * Information whether community can send a message to current user
     */
    @SerializedName("is_messages_blocked")
    private BoolInt isMessagesBlocked;

    /**
     * Information whether community can send notifications by phone number to current user
     */
    @SerializedName("can_send_notify")
    private BoolInt canSendNotify;

    /**
     * Status of replies in community messages
     */
    @SerializedName("online_status")
    private OnlineStatus onlineStatus;

    /**
     * Inviter ID
     */
    @SerializedName("invited_by")
    private Integer invitedBy;

    /**
     * Information whether age limit
     */
    @SerializedName("age_limits")
    private GroupFullAgeLimits ageLimits;

    /**
     * User ban info
     */
    @SerializedName("ban_info")
    private GroupBanInfo banInfo;

    /**
     * Information whether community has installed market app
     */
    @SerializedName("has_market_app")
    private Boolean hasMarketApp;

    @SerializedName("using_vkpay_market_app")
    private Boolean usingVkpayMarketApp;

    @SerializedName("has_group_channel")
    private Boolean hasGroupChannel;

    /**
     * Info about addresses in groups
     */
    @SerializedName("addresses")
    private AddressesInfo addresses;

    /**
     * Information whether current user is subscribed to podcasts
     */
    @SerializedName("is_subscribed_podcasts")
    private Boolean isSubscribedPodcasts;

    /**
     * Owner in whitelist or not
     */
    @SerializedName("can_subscribe_podcasts")
    private Boolean canSubscribePodcasts;

    /**
     * Can subscribe to wall
     */
    @SerializedName("can_subscribe_posts")
    private Boolean canSubscribePosts;

    /**
     * Live covers state
     */
    @SerializedName("live_covers")
    private LiveCovers liveCovers;

    @SerializedName("stories_archive_count")
    private Integer storiesArchiveCount;

    @SerializedName("has_unseen_stories")
    private Boolean hasUnseenStories;

    public MarketInfo getMarket() {
        return market;
    }

    public GetByIdObjectLegacyResponse setMarket(MarketInfo market) {
        this.market = market;
        return this;
    }

    public GroupFullMemberStatus getMemberStatus() {
        return memberStatus;
    }

    public GetByIdObjectLegacyResponse setMemberStatus(GroupFullMemberStatus memberStatus) {
        this.memberStatus = memberStatus;
        return this;
    }

    public boolean isAdult() {
        return isAdult == BoolInt.YES;
    }

    public BoolInt getIsAdult() {
        return isAdult;
    }

    public boolean isHiddenFromFeed() {
        return isHiddenFromFeed == BoolInt.YES;
    }

    public BoolInt getIsHiddenFromFeed() {
        return isHiddenFromFeed;
    }

    public boolean isFavorite() {
        return isFavorite == BoolInt.YES;
    }

    public BoolInt getIsFavorite() {
        return isFavorite;
    }

    public boolean isSubscribed() {
        return isSubscribed == BoolInt.YES;
    }

    public BoolInt getIsSubscribed() {
        return isSubscribed;
    }

    public BaseObject getCity() {
        return city;
    }

    public GetByIdObjectLegacyResponse setCity(BaseObject city) {
        this.city = city;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public GetByIdObjectLegacyResponse setCountry(Country country) {
        this.country = country;
        return this;
    }

    public boolean isVerified() {
        return verified == BoolInt.YES;
    }

    public BoolInt getVerified() {
        return verified;
    }

    public String getDescription() {
        return description;
    }

    public GetByIdObjectLegacyResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getWikiPage() {
        return wikiPage;
    }

    public GetByIdObjectLegacyResponse setWikiPage(String wikiPage) {
        this.wikiPage = wikiPage;
        return this;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public GetByIdObjectLegacyResponse setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
        return this;
    }

    public Integer getRequestsCount() {
        return requestsCount;
    }

    public GetByIdObjectLegacyResponse setRequestsCount(Integer requestsCount) {
        this.requestsCount = requestsCount;
        return this;
    }

    public Integer getVideoLiveLevel() {
        return videoLiveLevel;
    }

    public GetByIdObjectLegacyResponse setVideoLiveLevel(Integer videoLiveLevel) {
        this.videoLiveLevel = videoLiveLevel;
        return this;
    }

    public Integer getVideoLiveCount() {
        return videoLiveCount;
    }

    public GetByIdObjectLegacyResponse setVideoLiveCount(Integer videoLiveCount) {
        this.videoLiveCount = videoLiveCount;
        return this;
    }

    public Integer getClipsCount() {
        return clipsCount;
    }

    public GetByIdObjectLegacyResponse setClipsCount(Integer clipsCount) {
        this.clipsCount = clipsCount;
        return this;
    }

    public CountersGroup getCounters() {
        return counters;
    }

    public GetByIdObjectLegacyResponse setCounters(CountersGroup counters) {
        this.counters = counters;
        return this;
    }

    public Cover getCover() {
        return cover;
    }

    public GetByIdObjectLegacyResponse setCover(Cover cover) {
        this.cover = cover;
        return this;
    }

    public boolean canPost() {
        return canPost == BoolInt.YES;
    }

    public BoolInt getCanPost() {
        return canPost;
    }

    public boolean canSuggest() {
        return canSuggest == BoolInt.YES;
    }

    public BoolInt getCanSuggest() {
        return canSuggest;
    }

    public boolean canUploadStory() {
        return canUploadStory == BoolInt.YES;
    }

    public BoolInt getCanUploadStory() {
        return canUploadStory;
    }

    public boolean canUploadDoc() {
        return canUploadDoc == BoolInt.YES;
    }

    public BoolInt getCanUploadDoc() {
        return canUploadDoc;
    }

    public boolean canUploadVideo() {
        return canUploadVideo == BoolInt.YES;
    }

    public BoolInt getCanUploadVideo() {
        return canUploadVideo;
    }

    public boolean canSeeAllPosts() {
        return canSeeAllPosts == BoolInt.YES;
    }

    public BoolInt getCanSeeAllPosts() {
        return canSeeAllPosts;
    }

    public boolean canCreateTopic() {
        return canCreateTopic == BoolInt.YES;
    }

    public BoolInt getCanCreateTopic() {
        return canCreateTopic;
    }

    public String getActivity() {
        return activity;
    }

    public GetByIdObjectLegacyResponse setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public Integer getFixedPost() {
        return fixedPost;
    }

    public GetByIdObjectLegacyResponse setFixedPost(Integer fixedPost) {
        this.fixedPost = fixedPost;
        return this;
    }

    public boolean isHasPhoto() {
        return hasPhoto == BoolInt.YES;
    }

    public BoolInt getHasPhoto() {
        return hasPhoto;
    }

    public CropPhoto getCropPhoto() {
        return cropPhoto;
    }

    public GetByIdObjectLegacyResponse setCropPhoto(CropPhoto cropPhoto) {
        this.cropPhoto = cropPhoto;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public GetByIdObjectLegacyResponse setStatus(String status) {
        this.status = status;
        return this;
    }

    public Audio getStatusAudio() {
        return statusAudio;
    }

    public GetByIdObjectLegacyResponse setStatusAudio(Audio statusAudio) {
        this.statusAudio = statusAudio;
        return this;
    }

    public Integer getMainAlbumId() {
        return mainAlbumId;
    }

    public GetByIdObjectLegacyResponse setMainAlbumId(Integer mainAlbumId) {
        this.mainAlbumId = mainAlbumId;
        return this;
    }

    public List<LinksItem> getLinks() {
        return links;
    }

    public GetByIdObjectLegacyResponse setLinks(List<LinksItem> links) {
        this.links = links;
        return this;
    }

    public List<ContactsItem> getContacts() {
        return contacts;
    }

    public GetByIdObjectLegacyResponse setContacts(List<ContactsItem> contacts) {
        this.contacts = contacts;
        return this;
    }

    public GetByIdObjectLegacyResponseWall getWall() {
        return wall;
    }

    public GetByIdObjectLegacyResponse setWall(GetByIdObjectLegacyResponseWall wall) {
        this.wall = wall;
        return this;
    }

    public String getSite() {
        return site;
    }

    public GetByIdObjectLegacyResponse setSite(String site) {
        this.site = site;
        return this;
    }

    public GroupFullSection getMainSection() {
        return mainSection;
    }

    public GetByIdObjectLegacyResponse setMainSection(GroupFullSection mainSection) {
        this.mainSection = mainSection;
        return this;
    }

    public GroupFullSection getSecondarySection() {
        return secondarySection;
    }

    public GetByIdObjectLegacyResponse setSecondarySection(GroupFullSection secondarySection) {
        this.secondarySection = secondarySection;
        return this;
    }

    public boolean isTrending() {
        return trending == BoolInt.YES;
    }

    public BoolInt getTrending() {
        return trending;
    }

    public boolean canMessage() {
        return canMessage == BoolInt.YES;
    }

    public BoolInt getCanMessage() {
        return canMessage;
    }

    public boolean isMessagesBlocked() {
        return isMessagesBlocked == BoolInt.YES;
    }

    public BoolInt getIsMessagesBlocked() {
        return isMessagesBlocked;
    }

    public boolean canSendNotify() {
        return canSendNotify == BoolInt.YES;
    }

    public BoolInt getCanSendNotify() {
        return canSendNotify;
    }

    public OnlineStatus getOnlineStatus() {
        return onlineStatus;
    }

    public GetByIdObjectLegacyResponse setOnlineStatus(OnlineStatus onlineStatus) {
        this.onlineStatus = onlineStatus;
        return this;
    }

    public Integer getInvitedBy() {
        return invitedBy;
    }

    public GetByIdObjectLegacyResponse setInvitedBy(Integer invitedBy) {
        this.invitedBy = invitedBy;
        return this;
    }

    public GroupFullAgeLimits getAgeLimits() {
        return ageLimits;
    }

    public GetByIdObjectLegacyResponse setAgeLimits(GroupFullAgeLimits ageLimits) {
        this.ageLimits = ageLimits;
        return this;
    }

    public GroupBanInfo getBanInfo() {
        return banInfo;
    }

    public GetByIdObjectLegacyResponse setBanInfo(GroupBanInfo banInfo) {
        this.banInfo = banInfo;
        return this;
    }

    public Boolean getHasMarketApp() {
        return hasMarketApp;
    }

    public GetByIdObjectLegacyResponse setHasMarketApp(Boolean hasMarketApp) {
        this.hasMarketApp = hasMarketApp;
        return this;
    }

    public Boolean getUsingVkpayMarketApp() {
        return usingVkpayMarketApp;
    }

    public GetByIdObjectLegacyResponse setUsingVkpayMarketApp(Boolean usingVkpayMarketApp) {
        this.usingVkpayMarketApp = usingVkpayMarketApp;
        return this;
    }

    public Boolean getHasGroupChannel() {
        return hasGroupChannel;
    }

    public GetByIdObjectLegacyResponse setHasGroupChannel(Boolean hasGroupChannel) {
        this.hasGroupChannel = hasGroupChannel;
        return this;
    }

    public AddressesInfo getAddresses() {
        return addresses;
    }

    public GetByIdObjectLegacyResponse setAddresses(AddressesInfo addresses) {
        this.addresses = addresses;
        return this;
    }

    public Boolean getIsSubscribedPodcasts() {
        return isSubscribedPodcasts;
    }

    public GetByIdObjectLegacyResponse setIsSubscribedPodcasts(Boolean isSubscribedPodcasts) {
        this.isSubscribedPodcasts = isSubscribedPodcasts;
        return this;
    }

    public Boolean getCanSubscribePodcasts() {
        return canSubscribePodcasts;
    }

    public GetByIdObjectLegacyResponse setCanSubscribePodcasts(Boolean canSubscribePodcasts) {
        this.canSubscribePodcasts = canSubscribePodcasts;
        return this;
    }

    public Boolean getCanSubscribePosts() {
        return canSubscribePosts;
    }

    public GetByIdObjectLegacyResponse setCanSubscribePosts(Boolean canSubscribePosts) {
        this.canSubscribePosts = canSubscribePosts;
        return this;
    }

    public LiveCovers getLiveCovers() {
        return liveCovers;
    }

    public GetByIdObjectLegacyResponse setLiveCovers(LiveCovers liveCovers) {
        this.liveCovers = liveCovers;
        return this;
    }

    public Integer getStoriesArchiveCount() {
        return storiesArchiveCount;
    }

    public GetByIdObjectLegacyResponse setStoriesArchiveCount(Integer storiesArchiveCount) {
        this.storiesArchiveCount = storiesArchiveCount;
        return this;
    }

    public Boolean getHasUnseenStories() {
        return hasUnseenStories;
    }

    public GetByIdObjectLegacyResponse setHasUnseenStories(Boolean hasUnseenStories) {
        this.hasUnseenStories = hasUnseenStories;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(trending, country, canSubscribePosts, addresses, canCreateTopic, invitedBy, banInfo, onlineStatus, cover, mainAlbumId, isSubscribed, canUploadVideo, hasUnseenStories, storiesArchiveCount, links, membersCount, counters, requestsCount, canSeeAllPosts, canSuggest, canMessage, market, videoLiveCount, canUploadDoc, canSubscribePodcasts, hasPhoto, hasGroupChannel, fixedPost, isHiddenFromFeed, statusAudio, status, isFavorite, wikiPage, mainSection, activity, city, cropPhoto, isSubscribedPodcasts, description, memberStatus, canSendNotify, videoLiveLevel, clipsCount, hasMarketApp, canPost, isAdult, isMessagesBlocked, verified, secondarySection, ageLimits, site, usingVkpayMarketApp, liveCovers, wall, canUploadStory, contacts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetByIdObjectLegacyResponse getByIdObjectLegacyResponse = (GetByIdObjectLegacyResponse) o;
        return Objects.equals(trending, getByIdObjectLegacyResponse.trending) &&
                Objects.equals(country, getByIdObjectLegacyResponse.country) &&
                Objects.equals(requestsCount, getByIdObjectLegacyResponse.requestsCount) &&
                Objects.equals(canUploadStory, getByIdObjectLegacyResponse.canUploadStory) &&
                Objects.equals(addresses, getByIdObjectLegacyResponse.addresses) &&
                Objects.equals(hasUnseenStories, getByIdObjectLegacyResponse.hasUnseenStories) &&
                Objects.equals(statusAudio, getByIdObjectLegacyResponse.statusAudio) &&
                Objects.equals(mainSection, getByIdObjectLegacyResponse.mainSection) &&
                Objects.equals(isAdult, getByIdObjectLegacyResponse.isAdult) &&
                Objects.equals(cover, getByIdObjectLegacyResponse.cover) &&
                Objects.equals(storiesArchiveCount, getByIdObjectLegacyResponse.storiesArchiveCount) &&
                Objects.equals(canSubscribePodcasts, getByIdObjectLegacyResponse.canSubscribePodcasts) &&
                Objects.equals(links, getByIdObjectLegacyResponse.links) &&
                Objects.equals(canSeeAllPosts, getByIdObjectLegacyResponse.canSeeAllPosts) &&
                Objects.equals(mainAlbumId, getByIdObjectLegacyResponse.mainAlbumId) &&
                Objects.equals(isMessagesBlocked, getByIdObjectLegacyResponse.isMessagesBlocked) &&
                Objects.equals(canUploadVideo, getByIdObjectLegacyResponse.canUploadVideo) &&
                Objects.equals(counters, getByIdObjectLegacyResponse.counters) &&
                Objects.equals(videoLiveCount, getByIdObjectLegacyResponse.videoLiveCount) &&
                Objects.equals(market, getByIdObjectLegacyResponse.market) &&
                Objects.equals(ageLimits, getByIdObjectLegacyResponse.ageLimits) &&
                Objects.equals(isSubscribedPodcasts, getByIdObjectLegacyResponse.isSubscribedPodcasts) &&
                Objects.equals(isSubscribed, getByIdObjectLegacyResponse.isSubscribed) &&
                Objects.equals(membersCount, getByIdObjectLegacyResponse.membersCount) &&
                Objects.equals(canSuggest, getByIdObjectLegacyResponse.canSuggest) &&
                Objects.equals(wikiPage, getByIdObjectLegacyResponse.wikiPage) &&
                Objects.equals(status, getByIdObjectLegacyResponse.status) &&
                Objects.equals(canMessage, getByIdObjectLegacyResponse.canMessage) &&
                Objects.equals(canCreateTopic, getByIdObjectLegacyResponse.canCreateTopic) &&
                Objects.equals(clipsCount, getByIdObjectLegacyResponse.clipsCount) &&
                Objects.equals(fixedPost, getByIdObjectLegacyResponse.fixedPost) &&
                Objects.equals(isFavorite, getByIdObjectLegacyResponse.isFavorite) &&
                Objects.equals(activity, getByIdObjectLegacyResponse.activity) &&
                Objects.equals(city, getByIdObjectLegacyResponse.city) &&
                Objects.equals(canSubscribePosts, getByIdObjectLegacyResponse.canSubscribePosts) &&
                Objects.equals(description, getByIdObjectLegacyResponse.description) &&
                Objects.equals(hasPhoto, getByIdObjectLegacyResponse.hasPhoto) &&
                Objects.equals(banInfo, getByIdObjectLegacyResponse.banInfo) &&
                Objects.equals(memberStatus, getByIdObjectLegacyResponse.memberStatus) &&
                Objects.equals(canSendNotify, getByIdObjectLegacyResponse.canSendNotify) &&
                Objects.equals(isHiddenFromFeed, getByIdObjectLegacyResponse.isHiddenFromFeed) &&
                Objects.equals(canPost, getByIdObjectLegacyResponse.canPost) &&
                Objects.equals(usingVkpayMarketApp, getByIdObjectLegacyResponse.usingVkpayMarketApp) &&
                Objects.equals(secondarySection, getByIdObjectLegacyResponse.secondarySection) &&
                Objects.equals(hasGroupChannel, getByIdObjectLegacyResponse.hasGroupChannel) &&
                Objects.equals(liveCovers, getByIdObjectLegacyResponse.liveCovers) &&
                Objects.equals(hasMarketApp, getByIdObjectLegacyResponse.hasMarketApp) &&
                Objects.equals(onlineStatus, getByIdObjectLegacyResponse.onlineStatus) &&
                Objects.equals(verified, getByIdObjectLegacyResponse.verified) &&
                Objects.equals(videoLiveLevel, getByIdObjectLegacyResponse.videoLiveLevel) &&
                Objects.equals(invitedBy, getByIdObjectLegacyResponse.invitedBy) &&
                Objects.equals(canUploadDoc, getByIdObjectLegacyResponse.canUploadDoc) &&
                Objects.equals(site, getByIdObjectLegacyResponse.site) &&
                Objects.equals(cropPhoto, getByIdObjectLegacyResponse.cropPhoto) &&
                Objects.equals(wall, getByIdObjectLegacyResponse.wall) &&
                Objects.equals(contacts, getByIdObjectLegacyResponse.contacts);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetByIdObjectLegacyResponse{");
        sb.append("trending=").append(trending);
        sb.append(", country=").append(country);
        sb.append(", requestsCount=").append(requestsCount);
        sb.append(", canUploadStory=").append(canUploadStory);
        sb.append(", addresses=").append(addresses);
        sb.append(", hasUnseenStories=").append(hasUnseenStories);
        sb.append(", statusAudio=").append(statusAudio);
        sb.append(", mainSection=").append(mainSection);
        sb.append(", isAdult=").append(isAdult);
        sb.append(", cover=").append(cover);
        sb.append(", storiesArchiveCount=").append(storiesArchiveCount);
        sb.append(", canSubscribePodcasts=").append(canSubscribePodcasts);
        sb.append(", links=").append(links);
        sb.append(", canSeeAllPosts=").append(canSeeAllPosts);
        sb.append(", mainAlbumId=").append(mainAlbumId);
        sb.append(", isMessagesBlocked=").append(isMessagesBlocked);
        sb.append(", canUploadVideo=").append(canUploadVideo);
        sb.append(", counters=").append(counters);
        sb.append(", videoLiveCount=").append(videoLiveCount);
        sb.append(", market=").append(market);
        sb.append(", ageLimits=").append(ageLimits);
        sb.append(", isSubscribedPodcasts=").append(isSubscribedPodcasts);
        sb.append(", isSubscribed=").append(isSubscribed);
        sb.append(", membersCount=").append(membersCount);
        sb.append(", canSuggest=").append(canSuggest);
        sb.append(", wikiPage='").append(wikiPage).append("'");
        sb.append(", status='").append(status).append("'");
        sb.append(", canMessage=").append(canMessage);
        sb.append(", canCreateTopic=").append(canCreateTopic);
        sb.append(", clipsCount=").append(clipsCount);
        sb.append(", fixedPost=").append(fixedPost);
        sb.append(", isFavorite=").append(isFavorite);
        sb.append(", activity='").append(activity).append("'");
        sb.append(", city=").append(city);
        sb.append(", canSubscribePosts=").append(canSubscribePosts);
        sb.append(", description='").append(description).append("'");
        sb.append(", hasPhoto=").append(hasPhoto);
        sb.append(", banInfo=").append(banInfo);
        sb.append(", memberStatus=").append(memberStatus);
        sb.append(", canSendNotify=").append(canSendNotify);
        sb.append(", isHiddenFromFeed=").append(isHiddenFromFeed);
        sb.append(", canPost=").append(canPost);
        sb.append(", usingVkpayMarketApp=").append(usingVkpayMarketApp);
        sb.append(", secondarySection=").append(secondarySection);
        sb.append(", hasGroupChannel=").append(hasGroupChannel);
        sb.append(", liveCovers=").append(liveCovers);
        sb.append(", hasMarketApp=").append(hasMarketApp);
        sb.append(", onlineStatus=").append(onlineStatus);
        sb.append(", verified=").append(verified);
        sb.append(", videoLiveLevel=").append(videoLiveLevel);
        sb.append(", invitedBy=").append(invitedBy);
        sb.append(", canUploadDoc=").append(canUploadDoc);
        sb.append(", site='").append(site).append("'");
        sb.append(", cropPhoto=").append(cropPhoto);
        sb.append(", wall=").append(wall);
        sb.append(", contacts=").append(contacts);
        sb.append('}');
        return sb.toString();
    }
}
