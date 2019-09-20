package com.tanven.flower.bean;

import java.util.List;

public class Syd {

    String json = "{\n" +
            "\t\"endpoint\":{\n" +
            "\n" +
            "\t\t\"locale\":\"zh-CN\"\n" +
            "\t\t\"device\":{\n" +
            "\t\t\t\"deviceId\":\"1231231\",\n" +
            "\t\t\t\"location\":{\n" +
            "\t\t\t\t\t\"\":\"\",\n" +
            "\t\t\t\t\t\"\":\"\",\n" +
            "\t\t\t\t\t\"\":\"\"\n" +
            "\n" +
            "\t\t\t\t   }\n" +
            "\t\t\n" +
            "\t\t\t\n" +
            "\t\t   }\n" +
            "\t   \n" +
            "\t   },\n" +
            "\n" +
            "\t\"header\":{\n" +
            "\n" +
            "\t\t\"type\":\"Intenterss\"\n" +
            "\t   }\n" +
            "\n" +
            "\t\"inquire\":{\n" +
            "\n" +
            "\t\t\t\"selectMode\":\"aaaa\",\n" +
            "\n" +
            "\t\t\t\"intents\":[{\n" +
            "\t\t\t\t\"intentSN\":\"ssss\",\n" +
            "\t\t\t\t\"channel\":\"3\",\n" +
            "\t\t\t\t\"intentCategoryId\":\"1002222\",\n" +
            "\t\t\t\t\"intentAbilities\":[{\n" +
            "\t\t\t\t\t\"intentName\":\"hw\",\n" +
            "\t\t\t\t\t\"abilityId\":\"sdfas\",\n" +
            "\t\t\t\t\t\"slots\":{\n" +
            "\t\t\t\t\t\t\"datetime\":{\n" +
            "\t\t\t\t\t\t\t\"name\":\"date\",\n" +
            "\t\t\t\t\t\t\t\"slotType\":\"JSON\",\n" +
            "\t\t\t\t\t\t\t\"values\":[{\n" +
            "\t\t\t\t\t\t\t\t\"orign\":\"jintian\",\n" +
            "\t\t\t\t\t\t\t\t\"extendValue\":{\n" +
            "\t\t\t\t\t\t\t\t\t\"start\":\"2019-09-20\",\n" +
            "\t\t\t\t\t\t\t\t\t\"end\":\"2019-09-20\"\n" +
            "\t\t\t\t\t\t\t\t}\n" +
            "\t\t\t\t\t\t\t}]\t\t\t\t\t\t\t\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t\t}\t\n" +
            "\t\t\t\t\t\t\n" +
            "\n" +
            "\n" +
            "\t\t\t\t\t}\n" +
            "\n" +
            "\t\t\t\t   }]\t\t\t\t\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\t\t\t}]\n" +
            "\t\t  }\n" +
            "\n" +
            "}\n" +
            "\n" +
            "\n";
    /**
     * endpoint : {"locale":"zh-CN","device":{"deviceId":"1231231","location":{"locationSystem":"sdfsf","latitude":"sfsaf","longitude":"sofas"}}}
     * header : {"type":"Intenterss"}
     * inquire : {"selectMode":"aaaa","intents":[{"intentSN":"ssss","channel":"3","intentCategoryId":"1002222","intentAbilities":[{"intentName":"hw","abilityId":"sdfas","slots":{"datetime":{"name":"date","slotType":"JSON","values":[{"orign":"jintian","extendValue":{"start":"2019-09-20","end":"2019-09-20"}}]}}}]}]}
     */

    private EndpointBean endpoint;
    private HeaderBean header;
    private InquireBean inquire;

    public EndpointBean getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(EndpointBean endpoint) {
        this.endpoint = endpoint;
    }

    public HeaderBean getHeader() {
        return header;
    }

    public void setHeader(HeaderBean header) {
        this.header = header;
    }

    public InquireBean getInquire() {
        return inquire;
    }

    public void setInquire(InquireBean inquire) {
        this.inquire = inquire;
    }

    public static class EndpointBean {
        /**
         * locale : zh-CN
         * device : {"deviceId":"1231231","location":{"locationSystem":"sdfsf","latitude":"sfsaf","longitude":"sofas"}}
         */

        private String locale;
        private DeviceBean device;

        public String getLocale() {
            return locale;
        }

        public void setLocale(String locale) {
            this.locale = locale;
        }

        public DeviceBean getDevice() {
            return device;
        }

        public void setDevice(DeviceBean device) {
            this.device = device;
        }

        public static class DeviceBean {
            /**
             * deviceId : 1231231
             * location : {"locationSystem":"sdfsf","latitude":"sfsaf","longitude":"sofas"}
             */

            private String deviceId;
            private LocationBean location;

            public String getDeviceId() {
                return deviceId;
            }

            public void setDeviceId(String deviceId) {
                this.deviceId = deviceId;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public static class LocationBean {
                /**
                 * locationSystem : sdfsf
                 * latitude : sfsaf
                 * longitude : sofas
                 */

                private String locationSystem;
                private String latitude;
                private String longitude;

                public String getLocationSystem() {
                    return locationSystem;
                }

                public void setLocationSystem(String locationSystem) {
                    this.locationSystem = locationSystem;
                }

                public String getLatitude() {
                    return latitude;
                }

                public void setLatitude(String latitude) {
                    this.latitude = latitude;
                }

                public String getLongitude() {
                    return longitude;
                }

                public void setLongitude(String longitude) {
                    this.longitude = longitude;
                }
            }
        }
    }

    public static class HeaderBean {
        /**
         * type : Intenterss
         */

        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class InquireBean {
        /**
         * selectMode : aaaa
         * intents : [{"intentSN":"ssss","channel":"3","intentCategoryId":"1002222","intentAbilities":[{"intentName":"hw","abilityId":"sdfas","slots":{"datetime":{"name":"date","slotType":"JSON","values":[{"orign":"jintian","extendValue":{"start":"2019-09-20","end":"2019-09-20"}}]}}}]}]
         */

        private String selectMode;
        private List<IntentsBean> intents;

        public String getSelectMode() {
            return selectMode;
        }

        public void setSelectMode(String selectMode) {
            this.selectMode = selectMode;
        }

        public List<IntentsBean> getIntents() {
            return intents;
        }

        public void setIntents(List<IntentsBean> intents) {
            this.intents = intents;
        }

        public static class IntentsBean {
            /**
             * intentSN : ssss
             * channel : 3
             * intentCategoryId : 1002222
             * intentAbilities : [{"intentName":"hw","abilityId":"sdfas","slots":{"datetime":{"name":"date","slotType":"JSON","values":[{"orign":"jintian","extendValue":{"start":"2019-09-20","end":"2019-09-20"}}]}}}]
             */

            private String intentSN;
            private String channel;
            private String intentCategoryId;
            private List<IntentAbilitiesBean> intentAbilities;

            public String getIntentSN() {
                return intentSN;
            }

            public void setIntentSN(String intentSN) {
                this.intentSN = intentSN;
            }

            public String getChannel() {
                return channel;
            }

            public void setChannel(String channel) {
                this.channel = channel;
            }

            public String getIntentCategoryId() {
                return intentCategoryId;
            }

            public void setIntentCategoryId(String intentCategoryId) {
                this.intentCategoryId = intentCategoryId;
            }

            public List<IntentAbilitiesBean> getIntentAbilities() {
                return intentAbilities;
            }

            public void setIntentAbilities(List<IntentAbilitiesBean> intentAbilities) {
                this.intentAbilities = intentAbilities;
            }

            public static class IntentAbilitiesBean {
                /**
                 * intentName : hw
                 * abilityId : sdfas
                 * slots : {"datetime":{"name":"date","slotType":"JSON","values":[{"orign":"jintian","extendValue":{"start":"2019-09-20","end":"2019-09-20"}}]}}
                 */

                private String intentName;
                private String abilityId;
                private SlotsBean slots;

                public String getIntentName() {
                    return intentName;
                }

                public void setIntentName(String intentName) {
                    this.intentName = intentName;
                }

                public String getAbilityId() {
                    return abilityId;
                }

                public void setAbilityId(String abilityId) {
                    this.abilityId = abilityId;
                }

                public SlotsBean getSlots() {
                    return slots;
                }

                public void setSlots(SlotsBean slots) {
                    this.slots = slots;
                }

                public static class SlotsBean {
                    /**
                     * datetime : {"name":"date","slotType":"JSON","values":[{"orign":"jintian","extendValue":{"start":"2019-09-20","end":"2019-09-20"}}]}
                     */

                    private DatetimeBean datetime;

                    public DatetimeBean getDatetime() {
                        return datetime;
                    }

                    public void setDatetime(DatetimeBean datetime) {
                        this.datetime = datetime;
                    }

                    public static class DatetimeBean {
                        /**
                         * name : date
                         * slotType : JSON
                         * values : [{"orign":"jintian","extendValue":{"start":"2019-09-20","end":"2019-09-20"}}]
                         */

                        private String name;
                        private String slotType;
                        private List<ValuesBean> values;

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getSlotType() {
                            return slotType;
                        }

                        public void setSlotType(String slotType) {
                            this.slotType = slotType;
                        }

                        public List<ValuesBean> getValues() {
                            return values;
                        }

                        public void setValues(List<ValuesBean> values) {
                            this.values = values;
                        }

                        public static class ValuesBean {
                            /**
                             * orign : jintian
                             * extendValue : {"start":"2019-09-20","end":"2019-09-20"}
                             */

                            private String orign;
                            private ExtendValueBean extendValue;

                            public String getOrign() {
                                return orign;
                            }

                            public void setOrign(String orign) {
                                this.orign = orign;
                            }

                            public ExtendValueBean getExtendValue() {
                                return extendValue;
                            }

                            public void setExtendValue(ExtendValueBean extendValue) {
                                this.extendValue = extendValue;
                            }

                            public static class ExtendValueBean {
                                /**
                                 * start : 2019-09-20
                                 * end : 2019-09-20
                                 */

                                private String start;
                                private String end;

                                public String getStart() {
                                    return start;
                                }

                                public void setStart(String start) {
                                    this.start = start;
                                }

                                public String getEnd() {
                                    return end;
                                }

                                public void setEnd(String end) {
                                    this.end = end;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
