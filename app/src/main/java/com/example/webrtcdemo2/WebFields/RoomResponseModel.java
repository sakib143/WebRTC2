package com.example.webrtcdemo2.WebFields;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RoomResponseModel {
    @SerializedName("params")
    @Expose
    private Params params;
    @SerializedName("result")
    @Expose
    private String result;

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public class Params {

        @SerializedName("is_initiator")
        @Expose
        private String isInitiator;
        @SerializedName("room_link")
        @Expose
        private String roomLink;
        @SerializedName("version_info")
        @Expose
        private String versionInfo;
        @SerializedName("messages")
        @Expose
        private List<Object> messages = null;
        @SerializedName("error_messages")
        @Expose
        private List<Object> errorMessages = null;
        @SerializedName("offer_options")
        @Expose
        private String offerOptions;
        @SerializedName("client_id")
        @Expose
        private String clientId;
        @SerializedName("ice_server_transports")
        @Expose
        private String iceServerTransports;
        @SerializedName("bypass_join_confirmation")
        @Expose
        private String bypassJoinConfirmation;
        @SerializedName("media_constraints")
        @Expose
        private String mediaConstraints;
        @SerializedName("include_loopback_js")
        @Expose
        private String includeLoopbackJs;
        @SerializedName("is_loopback")
        @Expose
        private String isLoopback;
        @SerializedName("wss_url")
        @Expose
        private String wssUrl;
        @SerializedName("pc_constraints")
        @Expose
        private String pcConstraints;
        @SerializedName("pc_config")
        @Expose
        private String pcConfig;
        @SerializedName("wss_post_url")
        @Expose
        private String wssPostUrl;
        @SerializedName("ice_server_url")
        @Expose
        private String iceServerUrl;
        @SerializedName("warning_messages")
        @Expose
        private List<Object> warningMessages = null;
        @SerializedName("room_id")
        @Expose
        private String roomId;

        public String getIsInitiator() {
            return isInitiator;
        }

        public void setIsInitiator(String isInitiator) {
            this.isInitiator = isInitiator;
        }

        public String getRoomLink() {
            return roomLink;
        }

        public void setRoomLink(String roomLink) {
            this.roomLink = roomLink;
        }

        public String getVersionInfo() {
            return versionInfo;
        }

        public void setVersionInfo(String versionInfo) {
            this.versionInfo = versionInfo;
        }

        public List<Object> getMessages() {
            return messages;
        }

        public void setMessages(List<Object> messages) {
            this.messages = messages;
        }

        public List<Object> getErrorMessages() {
            return errorMessages;
        }

        public void setErrorMessages(List<Object> errorMessages) {
            this.errorMessages = errorMessages;
        }

        public String getOfferOptions() {
            return offerOptions;
        }

        public void setOfferOptions(String offerOptions) {
            this.offerOptions = offerOptions;
        }

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getIceServerTransports() {
            return iceServerTransports;
        }

        public void setIceServerTransports(String iceServerTransports) {
            this.iceServerTransports = iceServerTransports;
        }

        public String getBypassJoinConfirmation() {
            return bypassJoinConfirmation;
        }

        public void setBypassJoinConfirmation(String bypassJoinConfirmation) {
            this.bypassJoinConfirmation = bypassJoinConfirmation;
        }

        public String getMediaConstraints() {
            return mediaConstraints;
        }

        public void setMediaConstraints(String mediaConstraints) {
            this.mediaConstraints = mediaConstraints;
        }

        public String getIncludeLoopbackJs() {
            return includeLoopbackJs;
        }

        public void setIncludeLoopbackJs(String includeLoopbackJs) {
            this.includeLoopbackJs = includeLoopbackJs;
        }

        public String getIsLoopback() {
            return isLoopback;
        }

        public void setIsLoopback(String isLoopback) {
            this.isLoopback = isLoopback;
        }

        public String getWssUrl() {
            return wssUrl;
        }

        public void setWssUrl(String wssUrl) {
            this.wssUrl = wssUrl;
        }

        public String getPcConstraints() {
            return pcConstraints;
        }

        public void setPcConstraints(String pcConstraints) {
            this.pcConstraints = pcConstraints;
        }

        public String getPcConfig() {
            return pcConfig;
        }

        public void setPcConfig(String pcConfig) {
            this.pcConfig = pcConfig;
        }

        public String getWssPostUrl() {
            return wssPostUrl;
        }

        public void setWssPostUrl(String wssPostUrl) {
            this.wssPostUrl = wssPostUrl;
        }

        public String getIceServerUrl() {
            return iceServerUrl;
        }

        public void setIceServerUrl(String iceServerUrl) {
            this.iceServerUrl = iceServerUrl;
        }

        public List<Object> getWarningMessages() {
            return warningMessages;
        }

        public void setWarningMessages(List<Object> warningMessages) {
            this.warningMessages = warningMessages;
        }

        public String getRoomId() {
            return roomId;
        }

        public void setRoomId(String roomId) {
            this.roomId = roomId;
        }

    }


}
