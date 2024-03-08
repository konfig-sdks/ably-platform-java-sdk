package com.konfigthis.client;

import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.HistoryApi;
import com.konfigthis.client.api.PublishingApi;
import com.konfigthis.client.api.PushApi;
import com.konfigthis.client.api.StatsApi;
import com.konfigthis.client.api.StatusApi;

public class Ably {
    private ApiClient apiClient;
    public final AuthenticationApi authentication;
    public final HistoryApi history;
    public final PublishingApi publishing;
    public final PushApi push;
    public final StatsApi stats;
    public final StatusApi status;

    public Ably() {
        this(null);
    }

    public Ably(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.history = new HistoryApi(this.apiClient);
        this.publishing = new PublishingApi(this.apiClient);
        this.push = new PushApi(this.apiClient);
        this.stats = new StatsApi(this.apiClient);
        this.status = new StatusApi(this.apiClient);
    }

}
