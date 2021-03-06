/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/ImportAppCatalog" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportAppCatalogRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the service role. If you omit this parameter, we create a service-linked role for AWS Migration Hub
     * in your account. Otherwise, the role that you provide must have the <a
     * href="https://docs.aws.amazon.com/migrationhub/latest/ug/new-customer-setup.html#sms-managed">policy and trust
     * policy</a> described in the <i>AWS Migration Hub User Guide</i>.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The name of the service role. If you omit this parameter, we create a service-linked role for AWS Migration Hub
     * in your account. Otherwise, the role that you provide must have the <a
     * href="https://docs.aws.amazon.com/migrationhub/latest/ug/new-customer-setup.html#sms-managed">policy and trust
     * policy</a> described in the <i>AWS Migration Hub User Guide</i>.
     * </p>
     * 
     * @param roleName
     *        The name of the service role. If you omit this parameter, we create a service-linked role for AWS
     *        Migration Hub in your account. Otherwise, the role that you provide must have the <a
     *        href="https://docs.aws.amazon.com/migrationhub/latest/ug/new-customer-setup.html#sms-managed">policy and
     *        trust policy</a> described in the <i>AWS Migration Hub User Guide</i>.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the service role. If you omit this parameter, we create a service-linked role for AWS Migration Hub
     * in your account. Otherwise, the role that you provide must have the <a
     * href="https://docs.aws.amazon.com/migrationhub/latest/ug/new-customer-setup.html#sms-managed">policy and trust
     * policy</a> described in the <i>AWS Migration Hub User Guide</i>.
     * </p>
     * 
     * @return The name of the service role. If you omit this parameter, we create a service-linked role for AWS
     *         Migration Hub in your account. Otherwise, the role that you provide must have the <a
     *         href="https://docs.aws.amazon.com/migrationhub/latest/ug/new-customer-setup.html#sms-managed">policy and
     *         trust policy</a> described in the <i>AWS Migration Hub User Guide</i>.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the service role. If you omit this parameter, we create a service-linked role for AWS Migration Hub
     * in your account. Otherwise, the role that you provide must have the <a
     * href="https://docs.aws.amazon.com/migrationhub/latest/ug/new-customer-setup.html#sms-managed">policy and trust
     * policy</a> described in the <i>AWS Migration Hub User Guide</i>.
     * </p>
     * 
     * @param roleName
     *        The name of the service role. If you omit this parameter, we create a service-linked role for AWS
     *        Migration Hub in your account. Otherwise, the role that you provide must have the <a
     *        href="https://docs.aws.amazon.com/migrationhub/latest/ug/new-customer-setup.html#sms-managed">policy and
     *        trust policy</a> described in the <i>AWS Migration Hub User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAppCatalogRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportAppCatalogRequest == false)
            return false;
        ImportAppCatalogRequest other = (ImportAppCatalogRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public ImportAppCatalogRequest clone() {
        return (ImportAppCatalogRequest) super.clone();
    }

}
