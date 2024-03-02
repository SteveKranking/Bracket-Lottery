package backet.lottery.backend.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import backet.lottery.backend.models.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{}