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

package com.openkoda.uicomponent;

import com.openkoda.core.form.AbstractOrganizationRelatedEntityForm;
import com.openkoda.core.repository.common.ScopedSecureRepository;
import com.openkoda.model.User;
import com.openkoda.model.common.SearchableOrganizationRelatedEntity;

public interface DataServices {
    ScopedSecureRepository<?> getRepository(String entityName);
    ScopedSecureRepository<?> getRepository(String entityKey, String securityScope);
    SearchableOrganizationRelatedEntity saveForm(AbstractOrganizationRelatedEntityForm form);
    SearchableOrganizationRelatedEntity saveForm(AbstractOrganizationRelatedEntityForm form, SearchableOrganizationRelatedEntity entity);
    AbstractOrganizationRelatedEntityForm getForm(String frontendMappingName);
    AbstractOrganizationRelatedEntityForm getForm(String frontendMappingName, SearchableOrganizationRelatedEntity entity);
    User registerUserOrReturnExisting(String email, String firstName, String lastName);

}
