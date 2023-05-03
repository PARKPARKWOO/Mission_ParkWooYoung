package com.ll.gramgram.boundedContext.instaMember.repository;

import com.ll.gramgram.base.rsData.RsData;
import com.ll.gramgram.boundedContext.instaMember.entity.InstaMemberSnapshot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface InstaMemberSnapshotRepository extends JpaRepository<InstaMemberSnapshot, Long> {
}
