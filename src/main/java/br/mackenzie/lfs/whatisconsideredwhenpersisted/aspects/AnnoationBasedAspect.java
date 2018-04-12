package br.mackenzie.lfs.whatisconsideredwhenpersisted.aspects;

import br.mackenzie.lfs.whatisconsideredwhenpersisted.dto.DTO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Aspect
@Configuration
@Slf4j
public class AnnoationBasedAspect {

    @Autowired
    private EntityManager em;

    @Around("@annotation(br.mackenzie.lfs.whatisconsideredwhenpersisted.aspects.Moo)")
    public void before(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("Before. Vai ser modificado.");

        Object [] args = joinPoint.getArgs();
        args[0] = "Modificado.";

        joinPoint.proceed(args);
    }

}
