// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;

import java.util.List;
import java.util.Objects;

/**
 * StatCategory object
 */
public class StatCategory implements Validable {
    @SerializedName("header")
    @Required
    private String header;

    @SerializedName("lines")
    @Required
    private List<StatLine> lines;

    public String getHeader() {
        return header;
    }

    public StatCategory setHeader(String header) {
        this.header = header;
        return this;
    }

    public List<StatLine> getLines() {
        return lines;
    }

    public StatCategory setLines(List<StatLine> lines) {
        this.lines = lines;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, lines);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatCategory statCategory = (StatCategory) o;
        return Objects.equals(header, statCategory.header) &&
                Objects.equals(lines, statCategory.lines);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("StatCategory{");
        sb.append("header='").append(header).append("'");
        sb.append(", lines=").append(lines);
        sb.append('}');
        return sb.toString();
    }
}