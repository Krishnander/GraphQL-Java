package com.demo.GQL.Resolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import com.demo.GQL.domain.BankAccount;
import com.demo.GQL.domain.Currency;

import graphql.kickstart.tools.GraphQLQueryResolver;

import java.util.UUID;

@Component
@Slf4j
public class BankAccountResolver implements GraphQLQueryResolver {
	public BankAccount bankAccount(UUID id) {
		log.info("UUID is"+id);
		return BankAccount.builder().id(id).name("Krishna").currency(Currency.USD).build();
	}
}
