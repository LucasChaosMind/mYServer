package io.explains.myonlymood.repository.NonEssential;

import io.explains.myonlymood.model.NonEssential.InvestmentTransactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentTransactionsRepository extends JpaRepository<InvestmentTransactions, Long> {
}
