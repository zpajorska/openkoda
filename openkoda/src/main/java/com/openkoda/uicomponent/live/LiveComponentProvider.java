/*
MIT License

Copyright (c) 2016-2023, Openkoda CDX Sp. z o.o. Sp. K. <openkoda.com>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
documentation files (the "Software"), to deal in the Software without restriction, including without limitation
the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software,
and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice
shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR
A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package com.openkoda.uicomponent.live;


import com.google.gson.annotations.Expose;
import com.openkoda.uicomponent.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LiveComponentProvider {

    @Expose
    public final DataServices data;
    @Expose
    public final IntegrationServices integrations;
    @Expose
    public final MessagesServices messages;
    @Expose
    public final UtilServices util;

    @Autowired(required = false)
    public final OpenAIServices openAI;
    public final SystemServices system;
    @Expose
    public final MediaServices media;

    public LiveComponentProvider(
            @Autowired DataServices data,
            @Autowired IntegrationServices integrations,
            @Autowired MessagesServices messages,
            @Autowired UtilServices util,
            @Autowired SystemServices system,
            @Autowired(required = false) OpenAIServices openAI,
            @Autowired MediaServices media) {
        this.data = data;
        this.integrations = integrations;
        this.messages = messages;
        this.util = util;
        this.system = system;
        this.openAI = openAI;
        this.media = media;
    }

}
