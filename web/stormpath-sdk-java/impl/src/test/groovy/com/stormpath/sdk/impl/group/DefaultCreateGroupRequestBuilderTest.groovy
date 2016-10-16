/*
 * Copyright 2013 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.stormpath.sdk.impl.group

import com.stormpath.sdk.group.Groups
import com.stormpath.sdk.impl.ds.InternalDataStore
import org.testng.annotations.Test

import static org.easymock.EasyMock.createStrictMock
import static org.testng.Assert.*

/**
 * @since 0.9
 */
class DefaultCreateGroupRequestBuilderTest {

    @Test
    void testWithCustomData() {
        def group = new DefaultGroup(createStrictMock(InternalDataStore))

        def request = new DefaultCreateGroupRequestBuilder(group).build()
        assertSame group, request.group
        assertFalse request.isGroupOptionsSpecified()

        request = new DefaultCreateGroupRequestBuilder(group).withResponseOptions(Groups.options().withCustomData()).build()
        assertSame group, request.group
        assertTrue request.isGroupOptionsSpecified()
        assertNotNull request.getGroupOptions()
    }

    @Test(expectedExceptions = IllegalStateException)
    void testBuild() {
        def group = new DefaultGroup(createStrictMock(InternalDataStore))

        def request = new DefaultCreateGroupRequestBuilder(group).build()
        assertSame group, request.group
        request.getGroupOptions()
    }
}
