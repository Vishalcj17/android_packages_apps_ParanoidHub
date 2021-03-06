/*
 * Copyright (C) 2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.aospa.hub.model;

public class UpdateStatus {

    public static final int UNKNOWN = -1;
    public static final int UNAVAILABLE = 0;
    public static final int CHECKING = 1;
    public static final int AVAILABLE = 2;
    public static final int STARTING = 3;
    public static final int DOWNLOADING = 4;
    public static final int DOWNLOAD_FAILED = 5;
    public static final int DOWNLOADED = 6;
    public static final int PAUSED = 7;
    public static final int PAUSED_ERROR = 8;
    public static final int DELETED = 9;
    public static final int VERIFYING = 10;
    public static final int VERIFIED = 11;
    public static final int VERIFICATION_FAILED = 12;
    public static final int INSTALLING = 13;
    public static final int INSTALLED = 14;
    public static final int INSTALLATION_FAILED = 15;
    public static final int INSTALLATION_CANCELLED = 16;
    public static final int INSTALLATION_SUSPENDED = 17;
    public static final int LOCAL_UPDATE = 18;
    public static final int LOCAL_UPDATE_FAILED = 19;
    public static final int PREPARING = 20;

    public static final class Persistent {
        public static final int UNKNOWN = 0;
        public static final int INCOMPLETE = 1;
        public static final int VERIFIED = 2;
    }
}
