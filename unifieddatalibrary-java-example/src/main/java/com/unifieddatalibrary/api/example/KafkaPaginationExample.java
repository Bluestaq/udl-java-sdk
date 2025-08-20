package com.unifieddatalibrary.api.example;

import com.unifieddatalibrary.api.client.UnifieddatalibraryClient;
import com.unifieddatalibrary.api.client.okhttp.UnifieddatalibraryOkHttpClient;
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesPage;
import com.unifieddatalibrary.api.models.securemessaging.SecureMessagingGetMessagesParams;

public class KafkaPaginationExample {

    private static final UnifieddatalibraryClient client = UnifieddatalibraryOkHttpClient.builder()
            .baseUrl("https://dev.unifieddatalibrary.com")
            .password(System.getenv("UDL_AUTH_PASSWORD"))
            .username(System.getenv("UDL_AUTH_USERNAME"))
            .build();

    public static void main(String[] args) {
        kafkaPaginationExample();
    }

    private static void kafkaPaginationExample() {
        // find a topic with messages in it
        String topic = "eop";

        // start at 0 for now
        long offset = 0;

        SecureMessagingGetMessagesPage page = client.secureMessaging()
                .getMessages(SecureMessagingGetMessagesParams.builder()
                        .topic(topic)
                        .offset(offset)
                        .maxResults(100L)
                        .build());

        System.out.println("Messages in topic '" + topic + "':");

        int pageNum = 1;
        while (true) {
            System.out.println("Page " + pageNum + " with " + page.items().size() + " items");

            if (!page.hasNextPage()) {
                break;
            }

            page = page.nextPage();
            pageNum++;
        }

        System.out.println("Total pages: " + pageNum);
    }
}
