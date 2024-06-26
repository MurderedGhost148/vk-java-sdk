// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;

import java.util.List;
import java.util.Objects;

/**
 * CreateChatWithPeerIdsResponse object
 */
public class CreateChatWithPeerIdsResponse implements Validable {
    /**
     * Chat ID
     */
    @SerializedName("chat_id")
    private Integer chatId;

    /**
     * List of successfully added peer ids
     */
    @SerializedName("peer_ids")
    private List<Long> peerIds;

    public Integer getChatId() {
        return chatId;
    }

    public CreateChatWithPeerIdsResponse setChatId(Integer chatId) {
        this.chatId = chatId;
        return this;
    }

    public List<Long> getPeerIds() {
        return peerIds;
    }

    public CreateChatWithPeerIdsResponse setPeerIds(List<Long> peerIds) {
        this.peerIds = peerIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peerIds, chatId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateChatWithPeerIdsResponse createChatWithPeerIdsResponse = (CreateChatWithPeerIdsResponse) o;
        return Objects.equals(peerIds, createChatWithPeerIdsResponse.peerIds) &&
                Objects.equals(chatId, createChatWithPeerIdsResponse.chatId);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("CreateChatWithPeerIdsResponse{");
        sb.append("peerIds=").append(peerIds);
        sb.append(", chatId=").append(chatId);
        sb.append('}');
        return sb.toString();
    }
}