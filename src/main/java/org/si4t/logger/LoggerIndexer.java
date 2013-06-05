/**
 * Copyright 2011-2013 Radagio & SDL
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

package org.si4t.logger;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.lucene.analysis.charfilter.HTMLStripCharFilter;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.common.SolrInputDocument;
import org.si4t.solr.SolrClientRequest.ServerMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.tridion.configuration.Configuration;
import com.tridion.configuration.ConfigurationException;
import com.tridion.storage.si4t.BaseIndexData;
import com.tridion.storage.si4t.BinaryIndexData;
import com.tridion.storage.si4t.IndexingException;
import com.tridion.storage.si4t.SearchIndex;
import com.tridion.storage.si4t.SearchIndexData;
import com.tridion.storage.si4t.Utils;

/**
 * SolrIndexer.
 * 
 * @author Jan Horsman
 * @version 1.20
 * @since 1.00
 */
public class LoggerIndexer implements SearchIndex
{
	private Logger log = LoggerFactory.getLogger(LoggerIndexer.class);

	@Override
	public void configure(Configuration configuration) throws ConfigurationException
	{
		log.debug("cofigure() called");
		log.debug("Configuration is: " + configuration.toString());
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.tridion.storage.si4t.SearchIndex#addBinaryToIndex(com
	 * .tridion.extensions.storage.search.SearchIndexData)
	 */
	@Override
	public void addBinaryToIndex(BinaryIndexData data) throws IndexingException
	{
		log.debug("addBinaryToIndex() called");
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.tridion.storage.si4t.SearchIndex#addPageToIndex(java
	 * .lang.String, org.w3c.dom.Document)
	 */
	@Override
	public void addItemToIndex(SearchIndexData data) throws IndexingException
	{
		log.debug("addItemToIndex() called");
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.tridion.storage.si4t.SearchIndex#removeBinaryFromIndex
	 * (com.tridion.storage.si4t.SearchIndexData)
	 */
	@Override
	public void removeBinaryFromIndex(BaseIndexData data) throws IndexingException
	{
		log.debug("addItemToIndex() called");
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.tridion.storage.si4t.SearchIndex#removePageFromIndex
	 * (com.tridion.storage.si4t.SearchIndexData)
	 */
	@Override
	public void removeItemFromIndex(BaseIndexData data) throws IndexingException
	{
		log.debug("removeItemFromIndex() called");
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.tridion.storage.si4t.SearchIndex#updateItemInIndex(com
	 * .tridion.extensions.storage.search.SearchIndexData)
	 */
	@Override
	public void updateItemInIndex(SearchIndexData data) throws IndexingException
	{
		log.debug("removeItemFromIndex() called");
	}

	/*
	 * (non-Javadoc)
	 * @see com.tridion.storage.si4t.SearchIndex#commit()
	 */
	@Override
	public void commit(String publicationId) throws IndexingException
	{
		log.debug("commit() called");
	}

	/*
	 * (non-Javadoc)
	 * @see com.tridion.storage.si4t.SearchIndex#destroy()
	 */
	@Override
	public void destroy()
	{
		log.debug("destroy() called");
	}
}
