// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.groups.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.net.URI;
import java.util.Objects;

/**
 * AddLinkResponse object
 */
public class AddLinkResponse implements Validable {
    /**
     * Link title
     */
    @SerializedName("name")
    private String name;

    /**
     * Link description
     */
    @SerializedName("desc")
    private String desc;

    /**
     * Information whether the link title can be edited
     */
    @SerializedName("edit_title")
    private BoolInt editTitle;

    /**
     * Link ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * URL of square image of the link with 100 pixels in width
     */
    @SerializedName("photo_100")
    private URI photo100;

    /**
     * URL of square image of the link with 50 pixels in width
     */
    @SerializedName("photo_50")
    private URI photo50;

    /**
     * Link URL
     */
    @SerializedName("url")
    private URI url;

    /**
     * Information whether the image on processing
     */
    @SerializedName("image_processing")
    private BoolInt imageProcessing;

    public String getName() {
        return name;
    }

    public AddLinkResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public AddLinkResponse setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public boolean isEditTitle() {
        return editTitle == BoolInt.YES;
    }

    public BoolInt getEditTitle() {
        return editTitle;
    }

    public Integer getId() {
        return id;
    }

    public AddLinkResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public URI getPhoto100() {
        return photo100;
    }

    public AddLinkResponse setPhoto100(URI photo100) {
        this.photo100 = photo100;
        return this;
    }

    public URI getPhoto50() {
        return photo50;
    }

    public AddLinkResponse setPhoto50(URI photo50) {
        this.photo50 = photo50;
        return this;
    }

    public URI getUrl() {
        return url;
    }

    public AddLinkResponse setUrl(URI url) {
        this.url = url;
        return this;
    }

    public boolean isImageProcessing() {
        return imageProcessing == BoolInt.YES;
    }

    public BoolInt getImageProcessing() {
        return imageProcessing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo100, editTitle, name, photo50, id, imageProcessing, url, desc);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddLinkResponse addLinkResponse = (AddLinkResponse) o;
        return Objects.equals(editTitle, addLinkResponse.editTitle) &&
                Objects.equals(photo50, addLinkResponse.photo50) &&
                Objects.equals(imageProcessing, addLinkResponse.imageProcessing) &&
                Objects.equals(name, addLinkResponse.name) &&
                Objects.equals(id, addLinkResponse.id) &&
                Objects.equals(photo100, addLinkResponse.photo100) &&
                Objects.equals(url, addLinkResponse.url) &&
                Objects.equals(desc, addLinkResponse.desc);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AddLinkResponse{");
        sb.append("editTitle=").append(editTitle);
        sb.append(", photo50=").append(photo50);
        sb.append(", imageProcessing=").append(imageProcessing);
        sb.append(", name='").append(name).append("'");
        sb.append(", id=").append(id);
        sb.append(", photo100=").append(photo100);
        sb.append(", url=").append(url);
        sb.append(", desc='").append(desc).append("'");
        sb.append('}');
        return sb.toString();
    }
}
