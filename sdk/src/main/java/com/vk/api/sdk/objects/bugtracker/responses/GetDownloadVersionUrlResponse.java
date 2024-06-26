// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.bugtracker.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.Objects;

/**
 * GetDownloadVersionUrlResponse object
 */
public class GetDownloadVersionUrlResponse implements Validable {
    @SerializedName("app_title")
    private String appTitle;

    @SerializedName("build_id")
    private Integer buildId;

    @SerializedName("build_name")
    private String buildName;

    @SerializedName("build_title")
    private String buildTitle;

    @SerializedName("bundle_name")
    private String bundleName;

    @SerializedName("url")
    @Required
    private String url;

    public String getAppTitle() {
        return appTitle;
    }

    public GetDownloadVersionUrlResponse setAppTitle(String appTitle) {
        this.appTitle = appTitle;
        return this;
    }

    public Integer getBuildId() {
        return buildId;
    }

    public GetDownloadVersionUrlResponse setBuildId(Integer buildId) {
        this.buildId = buildId;
        return this;
    }

    public String getBuildName() {
        return buildName;
    }

    public GetDownloadVersionUrlResponse setBuildName(String buildName) {
        this.buildName = buildName;
        return this;
    }

    public String getBuildTitle() {
        return buildTitle;
    }

    public GetDownloadVersionUrlResponse setBuildTitle(String buildTitle) {
        this.buildTitle = buildTitle;
        return this;
    }

    public String getBundleName() {
        return bundleName;
    }

    public GetDownloadVersionUrlResponse setBundleName(String bundleName) {
        this.bundleName = bundleName;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GetDownloadVersionUrlResponse setUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(buildName, bundleName, buildId, appTitle, buildTitle, url);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetDownloadVersionUrlResponse getDownloadVersionUrlResponse = (GetDownloadVersionUrlResponse) o;
        return Objects.equals(buildId, getDownloadVersionUrlResponse.buildId) &&
                Objects.equals(appTitle, getDownloadVersionUrlResponse.appTitle) &&
                Objects.equals(buildTitle, getDownloadVersionUrlResponse.buildTitle) &&
                Objects.equals(bundleName, getDownloadVersionUrlResponse.bundleName) &&
                Objects.equals(url, getDownloadVersionUrlResponse.url) &&
                Objects.equals(buildName, getDownloadVersionUrlResponse.buildName);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetDownloadVersionUrlResponse{");
        sb.append("buildId=").append(buildId);
        sb.append(", appTitle='").append(appTitle).append("'");
        sb.append(", buildTitle='").append(buildTitle).append("'");
        sb.append(", bundleName='").append(bundleName).append("'");
        sb.append(", url='").append(url).append("'");
        sb.append(", buildName='").append(buildName).append("'");
        sb.append('}');
        return sb.toString();
    }
}