package de.metas.session.jaxrs;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.adempiere.util.ISingletonService;

import de.metas.email.EMail;
import de.metas.email.EMailSentStatus;
import de.metas.process.ProcessExecutionResult;

/*
 * #%L
 * de.metas.adempiere.adempiere.base
 * %%
 * Copyright (C) 2016 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */
@Path("/server/")
public interface IServerService extends ISingletonService
{
	/**
	 * Execute process
	 *
	 * @param adPInstanceId
	 * @return process execution result
	 */
	@POST
	@Path("process")
	public ProcessExecutionResult process(int adPInstanceId);

	/**
	 * Send the email
	 * 
	 * @param email
	 * @return email sent status
	 */
	@POST
	@Path("sendEMail")
	EMailSentStatus sendEMail(EMail email);
}
