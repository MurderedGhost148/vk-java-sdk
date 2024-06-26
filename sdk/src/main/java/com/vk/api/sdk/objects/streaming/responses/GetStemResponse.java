// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.streaming.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.Objects;

/**
 * GetStemResponse object
 */
public class GetStemResponse implements Validable {
    /**
     * part of a word responsible for its lexical meaning
     */
    @SerializedName("stem")
    private String stem;

    public String getStem() {
        return stem;
    }

    public GetStemResponse setStem(String stem) {
        this.stem = stem;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stem);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GetStemResponse getStemResponse = (GetStemResponse) o;
        return Objects.equals(stem, getStemResponse.stem);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GetStemResponse{");
        sb.append("stem='").append(stem).append("'");
        sb.append('}');
        return sb.toString();
    }
}