/*
 * Copyright (C) 2018 The Android Open Source Project
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
package com.android.server.wm.flicker;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import com.google.common.io.ByteStreams;
import java.io.InputStream;

/** Helper functions for test file resources. */
class TestFileUtils {
    static byte[] readTestFile(String relativePath) throws Exception {
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        InputStream in = context.getResources().getAssets().open("testdata/" + relativePath);
        return ByteStreams.toByteArray(in);
    }
}
