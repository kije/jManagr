package ch.jmanagr.dal;


import ch.jmanagr.bo.Ticket;

import java.sql.SQLException;

/**
 * DAL class for Tickets. Extends {@link AbstractDAL}
 */
public class TicketsDAL extends AbstractDAL<Ticket>
{
	private static TicketsDAL instance;

	protected TicketsDAL() throws SQLException
	{
		super(Ticket.class);
	}

	/**
	 * Get singelton instance
	 *
	 * @return An TicketsDAL instance
	 *
	 * @throws SQLException
	 */
	public static TicketsDAL getInstance() throws SQLException
	{
		if (instance == null) {
			synchronized (ResourcesDAL.class) {
				if (instance == null) {
					instance = new TicketsDAL();
				}
			}
		}
		return instance;
	}

}
