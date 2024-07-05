package com.abreu.magalu_ms.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "channels")
public class Channel {

    @Id
    private Long channelId;

    private String description;

    public Channel() {}

    public Channel(Long channelId, String description) {
        this.channelId = channelId;
        this.description = description;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public enum Values {
        EMAIl(1L, "email"),
        SMS(2L, "sms"),
        PUSH(3L, "push"),
        WHATSAPP(4L, "whatsapp");

        private Long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Long getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public Channel toChannel() {
            return new Channel(id, description);
        }
    }
}
