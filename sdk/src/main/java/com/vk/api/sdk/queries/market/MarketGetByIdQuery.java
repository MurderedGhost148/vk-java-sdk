// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.market.responses.GetByIdResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getById method
 */
public class MarketGetByIdQuery extends AbstractQueryBuilder<MarketGetByIdQuery, GetByIdResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param itemIds value of "item ids" parameter.
     */
    public MarketGetByIdQuery(VkApiClient client, UserActor actor, String... itemIds) {
        super(client, "market.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        itemIds(itemIds);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param itemIds value of "item ids" parameter.
     */
    public MarketGetByIdQuery(VkApiClient client, UserActor actor, List<String> itemIds) {
        super(client, "market.getById", GetByIdResponse.class);
        accessToken(actor.getAccessToken());
        itemIds(itemIds);
    }

    /**
     * '1' - to return additional fields: 'likes, can_comment, car_repost, photos'. By default: '0'.
     *
     * @param value value of "extended" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    public MarketGetByIdQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * item_ids
     * Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetByIdQuery itemIds(String... value) {
        return unsafeParam("item_ids", value);
    }

    /**
     * Comma-separated ids list: {user id}_{item id}. If an item belongs to a community -{community id} is used. " 'Videos' value example: , '-4363_136089719,13245770_137352259'"
     *
     * @param value value of "item ids" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    protected MarketGetByIdQuery itemIds(List<String> value) {
        return unsafeParam("item_ids", value);
    }

    @Override
    protected MarketGetByIdQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("item_ids", "access_token");
    }
}
