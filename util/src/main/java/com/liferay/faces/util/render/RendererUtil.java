/**
 * Copyright (c) 2000-2014 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.util.render;

import java.io.IOException;

import javax.faces.context.ResponseWriter;

import com.liferay.faces.util.component.ComponentUtil;
import com.liferay.faces.util.component.Styleable;
import com.liferay.faces.util.lang.StringPool;


/**
 * @author  Neil Griffin
 */
public class RendererUtil {

	// Public Constants
	public static final String TEXT_JAVASCRIPT = "text/javascript";

	public static void encodeStylable(ResponseWriter responseWriter, Styleable styleable) throws IOException {
		encodeStylable(responseWriter, styleable, null);
	}

	public static void encodeStylable(ResponseWriter responseWriter, Styleable styleable, String classNames)
		throws IOException {

		String allCssClasses = ComponentUtil.concatAllCssClasses(styleable, classNames);
		responseWriter.writeAttribute(StringPool.CLASS, allCssClasses, Styleable.STYLE_CLASS);
	}
}
