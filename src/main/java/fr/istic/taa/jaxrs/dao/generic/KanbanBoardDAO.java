package fr.istic.taa.jaxrs.dao.generic;

import fr.istic.taa.jaxrs.domain.KanbanBoard;

public class KanbanBoardDAO extends AbstractJpaDao<Long, KanbanBoard>{
	
	public KanbanBoardDAO() {
		super(KanbanBoard.class);
	}

}