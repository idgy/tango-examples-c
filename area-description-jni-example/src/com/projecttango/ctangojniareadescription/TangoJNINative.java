/*
 * Copyright 2014 Google Inc. All Rights Reserved.
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

package com.projecttango.ctangojniareadescription;

public class TangoJNINative {
	static {
		System.loadLibrary("tango-native-jni");
	}

	public static native void Initialize(boolean isLearning, boolean isLoadedADF);

	public static native void ConnectService();

	public static native void DisconnectService();

	public static native void OnDestroy();

	public static native void SetupGraphic(int width, int height);

	public static native void Render();

	public static native void SetCamera(int camera_index);

	public static native double GetCurrentTimestamp(int index);

	public static native String SaveADF();

	public static native void RemoveAllAdfs();

	public static native String GetUUID();

	public static native String GetIsEnabledLearn();

	public static native String GetIsRelocalized();

	public static native String GetPoseString(int index);

	public static native int GetCurrentStatus(int index);
}
