package gov.polisen.ainwebserver.readHandlers;

import gov.polisen.orm.examples.PermissionsOnCaseExample;
import gov.polisen.orm.maps.PermissionsOnCaseMapper;
import gov.polisen.orm.models.PermissionsOnCase;
import io.undertow.server.HttpServerExchange;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class GetCasesForUser extends JSONSender {

	@Override
	protected Object getResult(HttpServerExchange exchange, SqlSession session) {
		PermissionsOnCaseMapper mapper = session
				.getMapper(PermissionsOnCaseMapper.class);

		int uid = Integer.parseInt(exchange.getRequestPath().substring(14));

		PermissionsOnCaseExample p = new PermissionsOnCaseExample();

		// Criteria c = p.or().andUseridEqualTo(uid);
		List<PermissionsOnCase> list = mapper.selectByExample(p);

		return list;
	}

}
