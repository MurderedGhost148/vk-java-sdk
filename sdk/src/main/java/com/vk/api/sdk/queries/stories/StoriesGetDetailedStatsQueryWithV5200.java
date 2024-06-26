// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.stories;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.stories.responses.GetStatsV5200Response;

import java.util.Arrays;
import java.util.List;

/**
 * Query for Stories.getDetailedStats method
 */
public class StoriesGetDetailedStatsQueryWithV5200 extends AbstractQueryBuilder<StoriesGetDetailedStatsQueryWithV5200, GetStatsV5200Response> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param ownerId value of "owner id" parameter. Entity - owner
     *
     * @param storyId value of "story id" parameter. Minimum is 0.
     */
    public StoriesGetDetailedStatsQueryWithV5200(VkApiClient client, UserActor actor, Long ownerId,
            Integer storyId) {
        super(client, "stories.getDetailedStats", GetStatsV5200Response.class);
        accessToken(actor.getAccessToken());
        ownerId(ownerId);
        storyId(storyId);
    }

    /**
     * Set owner id
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public StoriesGetDetailedStatsQueryWithV5200 ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Set story id
     *
     * @param value value of "story id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("story_id")
    public StoriesGetDetailedStatsQueryWithV5200 storyId(Integer value) {
        return unsafeParam("story_id", value);
    }

    @Override
    protected StoriesGetDetailedStatsQueryWithV5200 getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("story_id", "owner_id", "access_token");
    }
}