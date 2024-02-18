package me.bread.core.domain.entity

import me.bread.core.domain.enums.StartingPoint
import me.bread.core.domain.vo.MatchId
import java.time.Instant

class Match(
    val id: MatchId,
    val teams: Map<StartingPoint, Team>,
    val createdAt: Instant,
    val updatedAt: Instant,
)
